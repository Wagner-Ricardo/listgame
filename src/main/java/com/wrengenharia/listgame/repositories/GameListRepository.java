package com.wrengenharia.listgame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wrengenharia.listgame.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
