package com.wrengenharia.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrengenharia.listgame.dto.GameMinDTO;
import com.wrengenharia.listgame.entities.Game;
import com.wrengenharia.listgame.repositories.GameRepository;

/*
 * Component service registration 
 */
@Service
public class GameService {
	
	/*
	 *  Injection gameRepository class
	 */
	@Autowired
	private GameRepository gameRepository;
	

	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
