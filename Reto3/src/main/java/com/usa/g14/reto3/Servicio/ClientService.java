package com.usa.g14.reto3.Servicio;

import com.usa.g14.reto3.Modelo.Client;
import com.usa.g14.reto3.Repositorio.ClientRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositorio clientRepositorio;

    public List<Client> getAll(){
        return clientRepositorio.getAll();
    }
    public Optional<Client> getProduct(int id){
        return clientRepositorio.getClient(id);
    }
    public Client save(Client p){
        if(p.getIdClient()==null){
            return clientRepositorio.save(p);
        }else{
            Optional<Client> e = clientRepositorio.getClient(p.getIdClient());
            if(e.isPresent()){

                return p;
            }else{
                return clientRepositorio.save(p);
            }
        }
    }
    public Client update(Client p){
        if(p.getIdClient()!=null){
            Optional<Client> q = clientRepositorio.getClient(p.getIdClient());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                clientRepositorio.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Client>p= clientRepositorio.getClient(id);
        if(p.isPresent()){
            clientRepositorio.delete(p.get());
            flag=true;
        }
        return flag;

    }


}








