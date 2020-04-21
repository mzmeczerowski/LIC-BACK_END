package pl.edu.ug.hotel.domain.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.reservation.entity.Reservation;
import pl.edu.ug.hotel.domain.reservation.service.iface.IReservationService;

import java.util.List;

@Service
public class ReservationServiceImp implements IReservationService {

    IReservationRepository iReservationRepository;

    @Autowired
    ReservationServiceImp(IReservationRepository iReservationRepository) {
        this.iReservationRepository = iReservationRepository;
    }


    @Override
    public Long save(Reservation reservation) {
        return iReservationRepository.save(reservation).getId();
    }

    @Override
    public Reservation getById(Long id) {
        return iReservationRepository.findById(id).get();
    }

    @Override
    public List<Reservation> getAll() {
        return iReservationRepository.findAll();
    }

    @Override
    public Reservation update(Long id, Reservation reservation) {
        reservation.setId(id);
        return iReservationRepository.save(reservation);
    }

    @Override
    public void deleteById(Long id) {
        iReservationRepository.deleteById(id);
    }

    @Override
    public void delete(Reservation reservation) {
        iReservationRepository.delete(reservation);
    }
}
