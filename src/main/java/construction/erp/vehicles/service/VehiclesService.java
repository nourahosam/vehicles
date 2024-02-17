package construction.erp.vehicles.service;

import construction.erp.vehicles.DAO.Vehicles;

import java.util.List;

public interface VehiclesService {
    public Vehicles create(Vehicles request);
    public List<Vehicles> getAll();
    public Vehicles getById(Long id);
}
