package com.usa.g14.reto3.Repositorio;

import com.usa.g14.reto3.Interfaces.ClientInterface;
import com.usa.g14.reto3.Interfaces.ReservationInterface;
import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Modelo.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepositorio {

    @Autowired
    private ReservationInterface reservationInterface;

    public List<Reservation> getAll() {

        return (List<Reservation>) reservationInterface.findAll();
    }

    public Optional<Reservation> getReservation(int id) {

        return reservationInterface.findById(id);
    }

    public Reservation save(Reservation r) {

        return reservationInterface.save(r);
    }

        public void delete(Reservation r){

        reservationInterface.delete(r);
        }

    }

