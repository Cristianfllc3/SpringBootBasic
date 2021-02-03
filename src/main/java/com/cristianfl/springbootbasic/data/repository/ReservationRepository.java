package com.cristianfl.springbootbasic.data.repository;

import com.cristianfl.springbootbasic.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findByresDate(Date resDate);


    //El curso tenia esto!!
    // Iterable<Reservation> findReservationByReservationDate(Date date);
    //yo pense que Iterable<Reservation> findByReservationDate(Date date);
}
