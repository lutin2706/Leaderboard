package com.example.leaderboard.restControllers;

import com.example.leaderboard.entities.Achievement;
import com.example.leaderboard.entities.Player;
import com.example.leaderboard.repositories.AchievementRepository;
import com.example.leaderboard.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AchievementController {

    @Autowired
    private AchievementRepository achievementRepo;

    @GetMapping("/achievement/get/{id}")
    public Achievement getAchievementById(@PathVariable Long id) {
        return achievementRepo.getAchievementById(id);
    }

}
