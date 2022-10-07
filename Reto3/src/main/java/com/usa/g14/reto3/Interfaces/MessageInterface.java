package com.usa.g14.reto3.Interfaces;

import com.usa.g14.reto3.Modelo.Cabin;
import com.usa.g14.reto3.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageInterface extends CrudRepository<Message,Integer> {
}
