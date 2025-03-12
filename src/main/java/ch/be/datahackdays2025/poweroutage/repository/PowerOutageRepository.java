package ch.be.datahackdays2025.poweroutage.repository;


import ch.be.datahackdays2025.poweroutage.entity.PowerOutage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerOutageRepository extends JpaRepository<PowerOutage, Long> {
}
