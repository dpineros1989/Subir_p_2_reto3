package com.usa.g14.reto3.Controlador;

import com.usa.g14.reto3.Modelo.Message;
import com.usa.g14.reto3.Modelo.Reservation;
import com.usa.g14.reto3.Servicio.MessageService;
import com.usa.g14.reto3.Servicio.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")

public class MessageControlador {
    @Autowired
    private MessageService messageService;
    @GetMapping("/all")
    public List<Message> getAll() {
        return messageService.getAll();

    }

    @GetMapping("/{id}")
    public Optional<Message> getMessage(@PathVariable("id") int id){
        return messageService.getMessage(id);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message  m){
        return messageService.save(m);
    }
}
