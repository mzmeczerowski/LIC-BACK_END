package pl.edu.ug.hotel.domain.hotel.service.iface;

import pl.edu.ug.hotel.domain.hotel.entity.Hotel;

import java.util.List;

public interface IHotelService {

// CRUD

    // Create
    Long save(Hotel hotel);

    // Read
    Hotel getById(Long id);
    List<Hotel> getAll();

    //Update
    Hotel update(Long id, Hotel hotel);

    //Delete
    void deleteById(Long id);
    void delete(Hotel hotel);

}
