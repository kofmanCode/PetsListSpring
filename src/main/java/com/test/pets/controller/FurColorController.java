package com.test.pets.controller;

import com.test.pets.model.FurColor;
import com.test.pets.repository.FurColorRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class FurColorController {
    private final FurColorRepository furColorRepository;

    public FurColorController(FurColorRepository furColorRepository) {
        this.furColorRepository = furColorRepository;
    }

    @GetMapping("/fur_colors")
    public List<FurColor> getAllTypes() {
        return furColorRepository.findAll();
    }
}
