package pl.edu.ug.hotel.domain.address.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.address.entity.Address;

import java.util.List;

@Repository
public interface IAddressRepository extends CrudRepository<Address, Long> {

    List<Address> findAll();

}
