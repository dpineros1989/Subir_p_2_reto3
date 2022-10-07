package com.usa.g14.reto3.Servicio;

import com.usa.g14.reto3.Modelo.Message;
import com.usa.g14.reto3.Modelo.Reservation;
import com.usa.g14.reto3.Repositorio.MessageRepositorio;
import com.usa.g14.reto3.Repositorio.ReservationRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    @Autowired
    private MessageRepositorio messageRepositorio;

    public List<Message> getAll(){

        return messageRepositorio.getAll();
    }
    public Optional<Message> getMessage(int id){

        return messageRepositorio.getMessage(id);
    }
    public Message save(Message m){
        if(m.getIdMessage() ==null){
            return messageRepositorio.save(m);
        }else{
            Optional<Message> e = messageRepositorio.getMessage(m.getIdMessage());
            if(e.isPresent()){
                return messageRepositorio.save(m);
            }else{
                return m;
            }
        }
    }



}








