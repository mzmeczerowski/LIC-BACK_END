package pl.edu.ug.hotel.domain.room.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.room.service.iface.IRoomService;

import java.util.List;

@Service
public class RoomServiceImp implements IRoomService {

    IRoomRepository iRoomRepository;

    @Autowired
    RoomServiceImp(IRoomRepository iRoomRepository) {
        this.iRoomRepository = iRoomRepository;
    }


    @Override
    public Long save(Room room) {
        return iRoomRepository.save(room).getId();
    }

    @Override
    public Room getById(Long id) {
        return iRoomRepository.findById(id).get();
    }

    @Override
    public List<Room> getAll() {
        return iRoomRepository.findAll();
    }

    @Override
    public Room update(Long id, Room room) {
        room.setId(id);
        return iRoomRepository.save(room);
    }

    @Override
    public void deleteById(Long id) {
        iRoomRepository.deleteById(id);
    }

    @Override
    public void delete(Room room) {
        iRoomRepository.delete(room);
    }
}
