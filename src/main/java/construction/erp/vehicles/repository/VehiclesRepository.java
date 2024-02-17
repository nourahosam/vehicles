package construction.erp.vehicles.repository;

import construction.erp.vehicles.DAO.Vehicles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {
}
