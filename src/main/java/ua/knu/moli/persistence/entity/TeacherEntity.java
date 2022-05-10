package ua.knu.moli.persistence.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(exclude = {"containers"})
//@ToString(exclude = {"containers"})
public class TeacherEntity {
    @Id
    @NotNull
    private Integer ticketNumber;

    @NotNull
    private String name;

    @NotNull
    private String surname;

    @NotNull
    private Integer phone;

    @NotNull
    private String mail;

    @ManyToOne
    @JoinColumn(name="faculty_id")
    private FacultyEntity faculty;

    @OneToMany(mappedBy="teacher")
    @JsonIgnore
    private Set<TestEntity> tests;

    @ManyToMany(mappedBy = "teachers")
    @JsonIgnore
    private Set<SubjectEntity> employees;
}
