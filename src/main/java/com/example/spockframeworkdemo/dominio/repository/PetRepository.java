package com.example.spockframeworkdemo.dominio.repository;



import com.example.spockframeworkdemo.dominio.entity.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PetRepository extends CrudRepository<Pet,Integer> {
}
