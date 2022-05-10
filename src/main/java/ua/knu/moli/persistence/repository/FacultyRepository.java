package ua.knu.moli.persistence.repository;

import ua.knu.moli.persistence.entity.FacultyEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<FacultyEntity, String> {
}
