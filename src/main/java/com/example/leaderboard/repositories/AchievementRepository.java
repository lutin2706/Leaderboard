package com.example.leaderboard.repositories;

import com.example.leaderboard.entities.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {

    Achievement getAchievementById(Long id);

}
