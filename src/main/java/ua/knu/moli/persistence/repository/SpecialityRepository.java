package ua.knu.moli.persistence.repository;

import ua.knu.moli.persistence.entity.SpecialityEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<SpecialityEntity, String> {

}
