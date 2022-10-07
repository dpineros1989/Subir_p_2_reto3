package com.usa.g14.reto3.Servicio;

import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Modelo.Reservation;
import com.usa.g14.reto3.Repositorio.ClientRepositorio;
import com.usa.g14.reto3.Repositorio.ReservationRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepositorio reservationRepositorio;

    public List<Reservation> getAll(){

        return reservationRepositorio.getAll();
    }
    public Optional<Reservation> getReservation(int id){

        return reservationRepositorio.getReservation(id);
    }
    public Reservation save(Reservation r){
        if(r.getIdReservation() ==null){
            return reservationRepositorio.save(r);
        }else{
            Optional<Reservation> e = reservationRepositorio.getReservation(r.getIdReservation());
            if(e.isPresent()){
                return reservationRepositorio.save(r);
            }else{
                return r;
            }
        }
    }



}








