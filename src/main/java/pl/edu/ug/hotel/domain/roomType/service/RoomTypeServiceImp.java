package pl.edu.ug.hotel.domain.roomType.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.roomType.entity.RoomType;
import pl.edu.ug.hotel.domain.roomType.service.iface.IRoomTypeService;

import java.util.List;

@Service
public class RoomTypeServiceImp implements IRoomTypeService {

    IRoomTypeRepository iRoomTypeRepository;

    @Autowired
    RoomTypeServiceImp(IRoomTypeRepository iRoomTypeRepository) {
        this.iRoomTypeRepository = iRoomTypeRepository;
    }


    @Override
    public Long save(RoomType roomType) {
        return iRoomTypeRepository.save(roomType).getId();
    }

    @Override
    public RoomType getById(Long id) {
        return iRoomTypeRepository.findById(id).get();
    }

    @Override
    public List<RoomType> getAll() {
        return iRoomTypeRepository.findAll();
    }

    @Override
    public RoomType update(Long id, RoomType roomType) {
        roomType.setId(id);
        return iRoomTypeRepository.save(roomType);
    }

    @Override
    public void deleteById(Long id) {
        iRoomTypeRepository.deleteById(id);
    }

    @Override
    public void delete(RoomType roomType) {
        iRoomTypeRepository.delete(roomType);
    }
}
