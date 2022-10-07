package com.usa.g14.reto3.Repositorio;

import com.usa.g14.reto3.Interfaces.CabinInterface;
import com.usa.g14.reto3.Interfaces.ClientInterface;
import com.usa.g14.reto3.Modelo.Cabin;
import com.usa.g14.reto3.Modelo.Category;
import com.usa.g14.reto3.Modelo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepositorio {

    @Autowired
    private ClientInterface clientInterface;

    public List<Client> getAll() {
        return (List<Client>) clientInterface.findAll();
    }

    public Optional<Client> getClient(int id) {
        return clientInterface.findById(id);
    }

    public Client save(Client c) {
        return clientInterface.save(c);
    }

        public void delete(Client c){
            clientInterface.delete(c);
        }

    }

