package com.usa.g14.reto3.Controlador;

import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Modelo.Reservation;
import com.usa.g14.reto3.Servicio.ClientService;
import com.usa.g14.reto3.Servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Reservation")

public class ReservationControlador {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/all")
    public List<Reservation> getAll() {
        return reservationService.getAll();

    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id){
        return reservationService.getReservation(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation  r){
        return reservationService.save(r);

    }
}
