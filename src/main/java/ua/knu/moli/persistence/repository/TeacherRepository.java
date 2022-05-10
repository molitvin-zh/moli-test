package ua.knu.moli.persistence.repository;

import ua.knu.moli.persistence.entity.TeacherEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {

}
