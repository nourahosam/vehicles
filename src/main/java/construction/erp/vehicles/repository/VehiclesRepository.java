package construction.erp.vehicles.repository;

import construction.erp.vehicles.DAO.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {

//    @Modifying
//    @Query("Vehicles v set v.currentUserId = :userId where v.id = :id")
//    Vehicles updateCurrentUserId(@Param(value = "userId") Long userId, @Param(value = "id") Long id);
}
