package ch.be.datahackdays2025.poweroutage.repository;


import ch.be.datahackdays2025.poweroutage.entity.FirstEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface poweroutageRepository extends JpaRepository<FirstEntity, Long> {
    // Optional: Add custom query methods here
}