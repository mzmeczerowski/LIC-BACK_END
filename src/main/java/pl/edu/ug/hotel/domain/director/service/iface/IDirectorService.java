package pl.edu.ug.hotel.domain.director.service.iface;

import pl.edu.ug.hotel.domain.director.entity.Director;

import java.util.List;

public interface IDirectorService {

// CRUD

    // Create
    Long save(Director director);

    // Read
    Director getById(Long id);
    List<Director> getAll();

    //Update
    Director update(Long id, Director director);

    //Delete
    void deleteById(Long id);
    void delete(Director director
    );

}
