package pl.edu.ug.hotel.domain.user.service.iface;

import pl.edu.ug.hotel.domain.user.entity.User;

import java.util.List;

public interface IUserService {

// CRUD

    // Create
    Long save(User user);

    // Read
    User getById(Long id);
    List<User> getAll();

    //Update
    User update(Long id, User user);

    //Delete
    void deleteById(Long id);
    void delete(User user);

    //Others
    User findByUsername(String username);

}
