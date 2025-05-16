package ch.be.datahackdays2025.poweroutage.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.List;

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

    @Column(name = "grid_operator", nullable = false)
    private String gridOperator;

    @Column(name = "outage_type", nullable = false)
    private String outageType;

    @Column(name = "description")
    private String description;

    @Column(name = "start_time", nullable = false)
    private Date startTime;

    @Column(name = "estimated_end")
    private Date estimatedEnd;

    @Column(name = "status", nullable = false)
    private String status;

    @ElementCollection
    @CollectionTable(name = "affected_areas", joinColumns = @JoinColumn(name = "power_outage_id"))
    private List<AffectedArea> affectedAreas;

    @Column(name = "affected_customers")
    private Integer affectedCustomers;

    @Column(name = "report_source")
    private String reportSource;

    @Column(name = "last_update")
    private Date lastUpdate;
}

