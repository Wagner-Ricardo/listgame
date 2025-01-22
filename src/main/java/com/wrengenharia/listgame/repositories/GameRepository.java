package com.wrengenharia.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrengenharia.listgame.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
