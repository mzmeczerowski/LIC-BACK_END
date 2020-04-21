package pl.edu.ug.hotel.domain.receptionist.service.iface;

import pl.edu.ug.hotel.domain.receptionist.entity.Receptionist;

import java.util.List;

public interface IReceptionistService {

// CRUD

    // Create
    Long save(Receptionist receptionist);

    // Read
    Receptionist getById(Long id);
    List<Receptionist> getAll();

    //Update
    Receptionist update(Long id, Receptionist receptionist);

    //Delete
    void deleteById(Long id);
    void delete(Receptionist receptionist);

}
