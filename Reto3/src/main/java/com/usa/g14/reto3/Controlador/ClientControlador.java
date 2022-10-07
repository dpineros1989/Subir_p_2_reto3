package com.usa.g14.reto3.Controlador;

import com.usa.g14.reto3.Modelo.Cabin;
import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Servicio.CabinService;
import com.usa.g14.reto3.Servicio.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")

public class ClientControlador {
    @Autowired
    private ClientService clientService;
    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client p){
        return clientService.save(p);

    }
}
