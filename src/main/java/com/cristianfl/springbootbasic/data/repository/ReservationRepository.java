package com.cristianfl.springbootbasic.data.repository;

import com.cristianfl.springbootbasic.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository <Reservation,Long> {
}
