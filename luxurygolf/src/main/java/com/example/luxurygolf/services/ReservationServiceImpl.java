package com.example.luxurygolf.services;

import com.example.luxurygolf.domain.Reservation;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService{

    private final ReservationRepo reservationRepo;

    public ReservationServiceImpl(ReservationRepo reservationRepo) {
        this.reservationRepo = reservationRepo;
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepo.save(reservation);
    }
}
