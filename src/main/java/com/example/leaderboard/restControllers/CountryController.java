package com.example.leaderboard.restControllers;

import com.example.leaderboard.entities.Country;
import com.example.leaderboard.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/country/getAll")
    public List<Country> getAll() {
        return countryRepository.findAll();
    }
}
