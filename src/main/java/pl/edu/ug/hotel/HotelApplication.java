package pl.edu.ug.hotel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.edu.ug.hotel.domain.address.entity.Address;
import pl.edu.ug.hotel.domain.address.service.AddressServiceImp;
import pl.edu.ug.hotel.domain.director.entity.Director;
import pl.edu.ug.hotel.domain.director.service.DirectorServiceImp;
import pl.edu.ug.hotel.domain.hotel.entity.Hotel;
import pl.edu.ug.hotel.domain.hotel.service.HotelServiceImp;
import pl.edu.ug.hotel.domain.receptionist.service.ReceptionistServiceImp;
import pl.edu.ug.hotel.domain.reservation.service.ReservationServiceImp;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.room.service.RoomServiceImp;
import pl.edu.ug.hotel.domain.roomType.entity.RoomType;
import pl.edu.ug.hotel.domain.roomType.service.RoomTypeServiceImp;
import pl.edu.ug.hotel.domain.user.service.UserServiceImp;

@SpringBootApplication
public class HotelApplication {

    private static final Logger log = LoggerFactory.getLogger(HotelApplication.class);

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(HotelApplication.class, args);
    }

    @Bean
    public CommandLineRunner StartData(
            AddressServiceImp addressService,
            DirectorServiceImp directorService,
            HotelServiceImp hotelService,
            ReceptionistServiceImp receptionistService,
            ReservationServiceImp reservationService,
            RoomServiceImp roomService,
            RoomTypeServiceImp roomTypeService,
            UserServiceImp userService
    ) {
        return (args) -> {

            // save example RoomType
            RoomType roomType1 = new RoomType("single", "single bed room in standard edition", 60.00);
            RoomType roomType2 = new RoomType("double", "double bed for pairs room in standard edition", 100.00);
            roomTypeService.save(roomType1);
            roomTypeService.save(roomType2);

            // save example Room
            Room room1 = new Room(roomTypeService.getById((long) 1), (float) 10, true, true, false, false, false, false, false);
            Room room2 = new Room(roomTypeService.getById((long) 2), (float) 8, false, true, false, true, true, false, true);
            roomService.save(room1);
            roomService.save(room2);

            // save example Hotel
            Address address1 = new Address("Sopot", "83-100", "Grunwaldzka", "211", "");
            Address address2 = new Address("Gdańśk", "83-015", "Grunwaldzka", "158", "");
            Director director = new Director("Jan", "Kowalski", "997998999", address2, "janko", "kowalski123");

            Hotel hotel = new Hotel("Sheraton", "58763010203", address1, roomService.getAll(), director);

            addressService.save(address1);
            addressService.save(address2);
            directorService.save(director);
            hotelService.save(hotel);

            String haslo = "abcd";
            String zaszyfrowane = passwordEncoder.encode(haslo);
            log.info("To jest hasło: " + haslo);
            log.info("To zaszyfrwane: " + zaszyfrowane);
            log.info("To zaszyfrwane jeszcze raz: " + passwordEncoder.encode(haslo));

//            // save example Receptionist
//            receptionistService.save(new Receptionist());
//
//            // save example Reservation
//            reservationService.save(new Reservation());
//
//            // save example User
//            userService.save(new User());

        };
    }


}
