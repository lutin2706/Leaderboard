package com.example.leaderboard.repositories;

import com.example.leaderboard.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Player getPlayerById(Long id);

}
