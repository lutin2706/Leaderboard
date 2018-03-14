package com.example.leaderboard.repositories;

import com.example.leaderboard.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
