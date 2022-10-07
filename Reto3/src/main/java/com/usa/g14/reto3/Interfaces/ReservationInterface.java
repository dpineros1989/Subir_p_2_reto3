package com.usa.g14.reto3.Interfaces;

import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationInterface extends CrudRepository<Reservation,Integer> {
}
