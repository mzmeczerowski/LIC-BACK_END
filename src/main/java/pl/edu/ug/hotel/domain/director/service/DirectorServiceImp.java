package pl.edu.ug.hotel.domain.director.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.director.entity.Director;
import pl.edu.ug.hotel.domain.director.service.iface.IDirectorService;
import pl.edu.ug.hotel.domain.director.entity.Director;

import java.util.List;

@Service
public class DirectorServiceImp implements IDirectorService {

    IDirectorRepository iDirectorRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    DirectorServiceImp(IDirectorRepository iDirectorRepository, PasswordEncoder passwordEncoder) {
        this.iDirectorRepository = iDirectorRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Long save(Director director) {
        director.setPassword(passwordEncoder.encode(director.getPassword()));
        return iDirectorRepository.save(director).getId();
    }

    @Override
    public Director getById(Long id) {
        return iDirectorRepository.findById(id).get();
    }

    @Override
    public List<Director> getAll() {
        return iDirectorRepository.findAll();
    }

    @Override
    public Director update(Long id, Director director) {
        director.setId(id);
        if (getById((long) id).getPassword() != director.getPassword()) {
            director.setPassword(passwordEncoder.encode(director.getPassword()));
        }
        return iDirectorRepository.save(director);
    }

    @Override
    public void deleteById(Long id) {
        iDirectorRepository.deleteById(id);
    }

    @Override
    public void delete(Director director) {
        iDirectorRepository.delete(director);
    }
}
