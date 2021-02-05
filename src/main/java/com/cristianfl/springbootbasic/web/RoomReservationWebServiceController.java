package com.cristianfl.springbootbasic.web;

import com.cristianfl.springbootbasic.business.domain.RoomReservation;
import com.cristianfl.springbootbasic.business.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/reservation")
public class RoomReservationWebServiceController {

    private final ReservationService reservationService;
@Autowired
    public RoomReservationWebServiceController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<RoomReservation> getRoomReservationList(@RequestParam(name="date", required = false) String dateString){
    Date date = DataUtils.createDateFromDateString(dateString);
    return this.reservationService.getRoomReservationsForDate(date);
    }

}
