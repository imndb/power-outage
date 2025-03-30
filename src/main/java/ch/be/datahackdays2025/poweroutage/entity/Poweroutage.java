package ch.be.datahackdays2025.poweroutage.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "power_outage")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Poweroutage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String location;
    private String status;
}
