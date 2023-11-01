package com.example.spockframeworkdemo.dominio.service;

import com.example.spockframeworkdemo.dominio.entity.Pet;
import com.example.spockframeworkdemo.dominio.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;
    public Iterable<Pet> getAll(){
       return petRepository.findAll();
    }
    public Pet findId(Integer id){
        return petRepository.findOne(id);
    }
}
