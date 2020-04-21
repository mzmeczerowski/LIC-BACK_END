package pl.edu.ug.hotel.domain.address.service.iface;

import pl.edu.ug.hotel.domain.address.entity.Address;

import java.util.List;

public interface IAddressService {

// CRUD

    // Create
    Long save(Address address);

    // Read
    Address getById(Long id);
    List<Address> getAll();

    //Update
    Address update(Long id, Address address);

    //Delete
    void deleteById(Long id);
    void delete(Address address);

}
