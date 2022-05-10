package ua.knu.moli.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
public class StudentEntity {
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

    @NotNull
    private Integer course;

    @ManyToOne
    @JoinColumn(name="speciality_id")
    private SpecialityEntity speciality;
}
