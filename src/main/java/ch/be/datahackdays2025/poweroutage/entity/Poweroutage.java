package ch.be.datahackdays2025.poweroutage.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "powe_outage")
@NoArgsConstructor
public class Poweroutage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String status;

    // Getters and Setters
}
