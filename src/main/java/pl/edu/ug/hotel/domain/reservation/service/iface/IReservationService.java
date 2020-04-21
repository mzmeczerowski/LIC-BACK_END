package pl.edu.ug.hotel.domain.reservation.service.iface;


import pl.edu.ug.hotel.domain.reservation.entity.Reservation;

import java.util.List;

public interface IReservationService {

// CRUD

    // Create
    Long save(Reservation reservation);

    // Read
    Reservation getById(Long id);
    List<Reservation> getAll();

    //Update
    Reservation update(Long id, Reservation reservation);

    //Delete
    void deleteById(Long id);
    void delete(Reservation reservation);

}
