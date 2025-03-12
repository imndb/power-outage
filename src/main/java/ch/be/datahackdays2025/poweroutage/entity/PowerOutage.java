package ch.be.datahackdays2025.poweroutage.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "power_outage_info")
public class PowerOutage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String status;

    // Getters and Setters
}
