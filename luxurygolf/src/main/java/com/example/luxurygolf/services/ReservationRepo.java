package com.example.luxurygolf.services;

import com.example.luxurygolf.domain.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepo extends CrudRepository<Reservation,Long> {

    Reservation findReservationById(Long id);
}
