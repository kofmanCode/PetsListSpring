package com.test.pets.controller;

import com.test.pets.exception.ResourceNotFoundException;
import com.test.pets.model.Pet;
import com.test.pets.repository.PetRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PetController {
    private final PetRepository petRepository;

    public PetController(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    // Get all pets
    @GetMapping("/pets")
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    // Add pet REST api
    @PostMapping("/pets")
    public Pet createPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    // Get pet by id REST api
    @GetMapping("/pets/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable Long id) {

        Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pet don't exist with id: " + id));
        return ResponseEntity.ok(pet);
    }

    // Edit pet REST api
    @PutMapping("/pets/{id}")
    public ResponseEntity<Pet> updatePet(@PathVariable Long id, @RequestBody Pet petDetails) {
        Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pet don't exist with id: " + id));
        pet.setName(petDetails.getName());
        pet.setCode(petDetails.getCode());
        pet.setType(petDetails.getType());
        pet.setFurColor(petDetails.getFurColor());
        pet.setCountry(petDetails.getCountry());

        Pet updatedPet = petRepository.save(pet);

        return ResponseEntity.ok(updatedPet);
    }
}
