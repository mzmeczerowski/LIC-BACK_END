package pl.edu.ug.hotel.domain.user.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.user.entity.User;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
}
