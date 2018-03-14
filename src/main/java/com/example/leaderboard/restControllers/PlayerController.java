package com.example.leaderboard.restControllers;

import com.example.leaderboard.Models.PlayerDTO;
import com.example.leaderboard.entities.Player;
import com.example.leaderboard.repositories.CountryRepository;
import com.example.leaderboard.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepo;

    @Autowired
    private CountryRepository countryRepo;

    @GetMapping("/player/get/{id}")
    public PlayerDTO getPlayerById(@PathVariable Long id) {
        return new PlayerDTO(playerRepo.getPlayerById(id));
    }

    @GetMapping("/player/getAll")
    public ArrayList<PlayerDTO> getAll() {
        ArrayList<PlayerDTO> list = new ArrayList<>();
        playerRepo.findAll().stream().forEach(player -> list.add(new PlayerDTO(player)));
        return list;
    }

    @PostMapping("/player")
    public PlayerDTO createPlayer(@RequestBody PlayerDTO playerDTO) {
        Player player = new Player(playerDTO.getNickname());
        player.setCountry(countryRepo.getOne(playerDTO.getCountryId()));
        playerDTO.setId(playerRepo.save(player).getId());
        return playerDTO;
    }

//    @GetMapping("/player/getResponse")
//    public
}
