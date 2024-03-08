package construction.erp.vehicles.service;

import construction.erp.vehicles.DAO.Vehicles;
import construction.erp.vehicles.repository.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiclesServiceImpl implements VehiclesService {

//    public static Session getCurrentSessionFromConfig() {
//        // SessionFactory in Hibernate 5 example
//        Configuration config = new Configuration();
//        config.configure();
//        // local SessionFactory bean created
//        Session session;
//        try (SessionFactory sessionFactory = config.buildSessionFactory()) {
//            session = sessionFactory.getCurrentSession();
//        }
//        return session;
//    }

    @Autowired
    VehiclesRepository vehiclesRepository;

    @Override
    public Vehicles create(Vehicles request){
        return vehiclesRepository.save(request);
    }

    @Override
    public List<Vehicles> getAll(){
        return vehiclesRepository.findAll();
    }


//    @Override
//    public void updateData(Long currentUserId, Long id) {
//        Transaction transaction = null;
//
//        try {
//            transaction = getCurrentSessionFromConfig().beginTransaction();
//
//            // Update query using HQL
//            Query query = getCurrentSessionFromConfig().createQuery("update Vehicles v set v.currentUserId = :userId where v.id = :id");
//            query.setParameter("currentUserId", currentUserId);
//            query.setParameter("id", id);
//
//            int updatedCount = query.executeUpdate();
//            System.out.println("Number of records updated: " + updatedCount);
//
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            getCurrentSessionFromConfig().close();
//        }
//    }

    @Override
    public Vehicles getById(Long id){
        return vehiclesRepository.findById(id).orElseThrow();
    }

    @Override
    public Vehicles addEmployeeToVehicle(Long id, Vehicles vehicles){
        Vehicles oldVehicle = vehiclesRepository.findById(vehicles.getId()).orElseThrow();
        System.out.println("old vehicle" + oldVehicle.toString());
        oldVehicle.setCurrentUserId(id);
        return vehiclesRepository.saveAndFlush(oldVehicle);
    }

}
