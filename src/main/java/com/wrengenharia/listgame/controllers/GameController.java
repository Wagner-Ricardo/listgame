package com.wrengenharia.listgame.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wrengenharia.listgame.dto.GameMinDTO;

import com.wrengenharia.listgame.services.GameService;

/*
 * Declaration the class with controller and making available the access
 */
@RestController
@RequestMapping(value = "/games")
public class GameController {
	

	/*
	 * Injection GameService class
	 */
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
}
