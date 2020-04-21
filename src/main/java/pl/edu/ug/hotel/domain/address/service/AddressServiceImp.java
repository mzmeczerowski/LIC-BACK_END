package pl.edu.ug.hotel.domain.address.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.address.service.iface.IAddressService;
import pl.edu.ug.hotel.domain.address.entity.Address;

import java.util.List;

@Service
public class AddressServiceImp implements IAddressService {

    IAddressRepository iAddressRepository;

    @Autowired
    AddressServiceImp(IAddressRepository iAddressRepository) {
        this.iAddressRepository = iAddressRepository;
    }

    @Override
    public Long save(Address address) {
        return iAddressRepository.save(address).getId();
    }

    @Override
    public Address getById(Long id) {
        return iAddressRepository.findById(id).get();
    }

    @Override
    public List<Address> getAll() {
        return iAddressRepository.findAll();
    }

    @Override
    public Address update(Long id, Address address) {
        address.setId(id);
        return iAddressRepository.save(address);
    }

    @Override
    public void deleteById(Long id) {
        iAddressRepository.deleteById(id);
    }

    @Override
    public void delete(Address address) {
        iAddressRepository.delete(address);
    }
}
