package com.usa.g14.reto3.Repositorio;

import com.usa.g14.reto3.Interfaces.ClientInterface;
import com.usa.g14.reto3.Interfaces.MessageInterface;
import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Modelo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MessageRepositorio {

    @Autowired
    private MessageInterface messageInterface;

    public List<Message> getAll() {

        return (List<Message>) messageInterface.findAll();
    }

    public Optional<Message> getMessage(int id) {

        return messageInterface.findById(id);
    }

    public Message save(Message m) {
        return messageInterface.save(m);
    }

        public void delete(Message m){
            messageInterface.delete(m);
        }

    }

