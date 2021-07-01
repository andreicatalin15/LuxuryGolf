package com.example.luxurygolf.controllers;


import com.example.luxurygolf.domain.Reservation;
import com.example.luxurygolf.domain.User;
import com.example.luxurygolf.services.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/reserve")
public class ReserveController {

    @Autowired private ReservationService reservationService;
    @GetMapping
    public String reserve() {
        return "Reserve";
    }

    @PostMapping("/reserved")
    public String submit(@ModelAttribute("reservation") Reservation reservation){

        reservationService.save(reservation);
        System.out.println(reservation.getName());
        System.out.println("Reservation with the followin details: " + reservation);
        System.out.println("Reservation Complete");
        return "Register";
    }
}
