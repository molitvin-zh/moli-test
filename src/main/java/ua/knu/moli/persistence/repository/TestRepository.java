package ua.knu.moli.persistence.repository;

import ua.knu.moli.persistence.entity.TestEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestEntity, String> {

}
