package pl.edu.ug.hotel.domain.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.user.entity.User;
import pl.edu.ug.hotel.domain.user.service.iface.IUserService;

import java.util.List;

@Service
public class UserServiceImp implements IUserService {

    private IUserRepository iUserRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    UserServiceImp(IUserRepository iUserRepository, PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.iUserRepository = iUserRepository;
    }


    @Override
    public Long save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return iUserRepository.save(user).getId();
    }

    @Override
    public User getById(Long id) {
        return iUserRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return iUserRepository.findAll();
    }

    @Override
    public User update(Long id, User user) {
        user.setId(id);
        if (getById(id).getPassword() != user.getPassword()) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        return iUserRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
        iUserRepository.deleteById(id);
    }

    @Override
    public void delete(User user) {
        iUserRepository.delete(user);
    }
}
