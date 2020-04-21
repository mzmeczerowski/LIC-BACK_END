package pl.edu.ug.hotel.domain.receptionist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.receptionist.entity.Receptionist;
import pl.edu.ug.hotel.domain.receptionist.service.iface.IReceptionistService;

import java.util.List;

@Service
public class ReceptionistServiceImp implements IReceptionistService {

    IReceptionistRepository iReceptionistRepository;

    @Autowired
    ReceptionistServiceImp(IReceptionistRepository iReceptionistRepository) {
        this.iReceptionistRepository = iReceptionistRepository;
    }


    @Override
    public Long save(Receptionist receptionist) {
        return iReceptionistRepository.save(receptionist).getId();
    }

    @Override
    public Receptionist getById(Long id) {
        return iReceptionistRepository.findById(id).get();
    }

    @Override
    public List<Receptionist> getAll() {
        return iReceptionistRepository.findAll();
    }

    @Override
    public Receptionist update(Long id, Receptionist receptionist) {
        receptionist.setId(id);
        return iReceptionistRepository.save(receptionist);
    }

    @Override
    public void deleteById(Long id) {
        iReceptionistRepository.deleteById(id);
    }

    @Override
    public void delete(Receptionist receptionist) {
        iReceptionistRepository.delete(receptionist);
    }
}
