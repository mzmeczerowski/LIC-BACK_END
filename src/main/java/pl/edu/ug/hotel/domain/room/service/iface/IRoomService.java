package pl.edu.ug.hotel.domain.room.service.iface;

import pl.edu.ug.hotel.domain.room.entity.Room;

import java.util.List;

public interface IRoomService {

// CRUD

    // Create
    Long save(Room room);

    // Read
    Room getById(Long id);
    List<Room> getAll();

    //Update
    Room update(Long id, Room room);

    //Delete
    void deleteById(Long id);
    void delete(Room room);

}
