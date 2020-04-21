package pl.edu.ug.hotel.domain.room.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.room.entity.Room;

import java.util.List;

@Repository
public interface IRoomRepository extends CrudRepository<Room, Long> {

    List<Room> findAll();
}
