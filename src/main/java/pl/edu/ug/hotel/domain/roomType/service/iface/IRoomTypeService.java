package pl.edu.ug.hotel.domain.roomType.service.iface;

import pl.edu.ug.hotel.domain.roomType.entity.RoomType;

import java.util.List;

public interface IRoomTypeService {

// CRUD

    // Create
    Long save(RoomType roomType);

    // Read
    RoomType getById(Long id);
    List<RoomType> getAll();

    //Update
    RoomType update(Long id, RoomType roomType);

    //Delete
    void deleteById(Long id);
    void delete(RoomType roomType);

}
