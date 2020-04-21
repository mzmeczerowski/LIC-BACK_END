package pl.edu.ug.hotel.domain.reservation.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.reservation.entity.Reservation;

import java.util.List;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation, Long> {

    List<Reservation> findAll();
}
