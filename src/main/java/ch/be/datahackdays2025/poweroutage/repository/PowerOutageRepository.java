package ch.be.datahackdays2025.poweroutage.repository;


import ch.be.datahackdays2025.poweroutage.entity.Poweroutage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PowerOutageRepository extends JpaRepository<Poweroutage, Long> {

}