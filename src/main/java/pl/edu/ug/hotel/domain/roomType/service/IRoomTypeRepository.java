package pl.edu.ug.hotel.domain.roomType.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.ug.hotel.domain.roomType.entity.RoomType;

import java.util.List;

@Repository
public interface IRoomTypeRepository extends CrudRepository<RoomType, Long> {

    List<RoomType> findAll();
}
