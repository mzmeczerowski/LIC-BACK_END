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
import pl.edu.ug.hotel.domain.receptionist.entity.Receptionist;
import pl.edu.ug.hotel.domain.receptionist.service.ReceptionistServiceImp;
import pl.edu.ug.hotel.domain.reservation.entity.Reservation;
import pl.edu.ug.hotel.domain.reservation.service.ReservationServiceImp;
import pl.edu.ug.hotel.domain.room.entity.Room;
import pl.edu.ug.hotel.domain.room.service.RoomServiceImp;
import pl.edu.ug.hotel.domain.roomType.entity.RoomType;
import pl.edu.ug.hotel.domain.roomType.service.RoomTypeServiceImp;
import pl.edu.ug.hotel.domain.user.entity.User;
import pl.edu.ug.hotel.domain.user.service.UserServiceImp;

import java.time.LocalDate;
import java.time.Month;

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
            hotelService.save(hotel);

            // save example Receptionist
            Address address3 = new Address("Gdańsk", "80-010", "Słowackiego", "3d", "12");
            Receptionist receptionist = new Receptionist("Danuta", "Nowak", "123456789", address3, "danka", "nowakdanuta", 2399.32);

            receptionistService.save(receptionist);


            // save example User
            Address address4 = new Address("Starogard Gd", "83-212", "Nowatorów", "1F", "7");
            User user = new User("Adam", "Mickiewicz", "3452650001", address4, "amickiewicz", "adas");
            userService.save(user);

            // save example Reservation

            Reservation reservation = new Reservation(
                    LocalDate.of(2020, Month.JANUARY, 31),
                    LocalDate.of(2020, Month.FEBRUARY, 02),
                    user,
                    room1,
                    true,
                    false
                    );
            reservationService.save(reservation);


        };
    }


}
