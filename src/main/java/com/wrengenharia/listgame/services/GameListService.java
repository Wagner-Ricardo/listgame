package com.wrengenharia.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrengenharia.listgame.dto.GameDTO;
import com.wrengenharia.listgame.dto.GameListDTO;
import com.wrengenharia.listgame.dto.GameMinDTO;
import com.wrengenharia.listgame.entities.Game;
import com.wrengenharia.listgame.entities.GameList;
import com.wrengenharia.listgame.repositories.GameListRepository;



/*
 * Component service registration 
 */
@Service
public class GameListService {
	
	/*
	 *  Injection gameRepository class
	 */
	@Autowired
	private GameListRepository gameListRepository;
	
	/*
	 * created request and use spring transactional method to salve in the database
	 */


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	

}
