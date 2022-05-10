package ua.knu.moli.persistence.repository;

import ua.knu.moli.persistence.entity.StudentEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}
