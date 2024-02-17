package construction.erp.vehicles.DAO;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "vehicles")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plate_no")
    private String plateNo;
    @Column(name = "plate_type")
    private String plateType;
    @Column(name = "branch")
    private String branch;
    @Column(name = "vehicle_brand")
    private String vehicleBrand;
    @Column(name = "model")
    private String model;
    @Column(name = "year")
    private Integer year;
    @Column(name = "serial_no")
    private Integer serialNo;
    @Column(name = "vehicle_no")
    private Integer vehicleNo;
    @Column(name = "color")
    private String color;
    @Column(name = "sec_color")
    private String secondaryColor;
    @Column(name = "veh_state")
    private String vehState;
    @Column(name = "licence_end_dt")
    private LocalDate licenceEndDt;
    @Column(name = "checkup_dt")
    private String checkupEndDt;
    @Column(name = "checkup_state")
    private String checkupState;
    @Column(name = "insurance_state")
    private String insuranceState;

    @JoinColumn(name = "current_user_id")
    //@OneToOne
    private Long currentUserId;
}
