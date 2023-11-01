package com.example.spockframeworkdemo.controller.V1_0;

import com.example.spockframeworkdemo.dominio.entity.Pet;
import com.example.spockframeworkdemo.dominio.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/v1/pets")
public class PetController {
    @Autowired
    private PetService petService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Iterable<Pet> getAll() {
        return petService.getAll();
    }
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Pet findById(@PathVariable("id") Integer id) {
        return petService.findId(id);
    }
}
