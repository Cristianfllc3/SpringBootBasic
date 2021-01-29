package com.cristianfl.springbootbasic;

import com.cristianfl.springbootbasic.data.entity.Guest;
import com.cristianfl.springbootbasic.data.entity.Reservation;
import com.cristianfl.springbootbasic.data.entity.Room;
import com.cristianfl.springbootbasic.data.repository.GuestRepository;
import com.cristianfl.springbootbasic.data.repository.ReservationRepository;
import com.cristianfl.springbootbasic.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootbasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootbasicApplication.class, args);
    }

    @RestController
    @RequestMapping("/rooms")
    public class RoomController{
        @Autowired
        private RoomRepository roomRepository;

        @GetMapping
        public Iterable<Room> getRooms(){
            return this.roomRepository.findAll();
        }
    }
    @RestController
    @RequestMapping("/guest")
    public class GuestController{
        @Autowired
        private GuestRepository guestRepository;

        @GetMapping
        public Iterable<Guest> getGuest(){
            return this.guestRepository.findAll();
        }
    }

    @RestController
    @RequestMapping("/reservations")
    public class ReservationtController{
        @Autowired
        private ReservationRepository reservationRepository;

        @GetMapping
        public Iterable<Reservation> getReservation(){
            return this.reservationRepository.findAll();
        }
    }

}
