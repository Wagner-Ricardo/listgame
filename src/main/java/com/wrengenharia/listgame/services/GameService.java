package com.wrengenharia.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrengenharia.listgame.dto.GameDTO;
import com.wrengenharia.listgame.dto.GameMinDTO;
import com.wrengenharia.listgame.entities.Game;
import com.wrengenharia.listgame.projections.GameMinProjection;
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
	
	/*
	 * created request and use spring transactional method to salve in the database
	 */
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto =  new GameDTO(result);
		return dto;
	}


	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	

	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
