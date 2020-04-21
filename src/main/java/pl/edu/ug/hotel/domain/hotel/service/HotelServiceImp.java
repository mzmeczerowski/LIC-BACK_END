package pl.edu.ug.hotel.domain.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.hotel.entity.Hotel;
import pl.edu.ug.hotel.domain.hotel.service.iface.IHotelService;
import pl.edu.ug.hotel.domain.hotel.entity.Hotel;

import java.util.List;

@Service
public class HotelServiceImp implements IHotelService {

    IHotelRepository iHotelRepository;

    @Autowired
    HotelServiceImp(IHotelRepository iHotelRepository) {
        this.iHotelRepository = iHotelRepository;
    }


    @Override
    public Long save(Hotel hotel) {
        return iHotelRepository.save(hotel).getId();
    }

    @Override
    public Hotel getById(Long id) {
        return iHotelRepository.findById(id).get();
    }

    @Override
    public List<Hotel> getAll() {
        return iHotelRepository.findAll();
    }

    @Override
    public Hotel update(Long id, Hotel hotel) {
        hotel.setId(id);
        return iHotelRepository.save(hotel);
    }

    @Override
    public void deleteById(Long id) {
        iHotelRepository.deleteById(id);
    }

    @Override
    public void delete(Hotel hotel) {
        iHotelRepository.delete(hotel);
    }
}
