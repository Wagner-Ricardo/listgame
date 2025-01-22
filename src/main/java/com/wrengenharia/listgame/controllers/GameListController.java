package com.wrengenharia.listgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wrengenharia.listgame.dto.GameDTO;
import com.wrengenharia.listgame.dto.GameListDTO;
import com.wrengenharia.listgame.dto.GameMinDTO;
import com.wrengenharia.listgame.services.GameListService;
import com.wrengenharia.listgame.services.GameService;

/*
 * Declaration the class with controller and making available the access
 */
@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	

	/*
	 * Injection GameService class
	 */
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
}
