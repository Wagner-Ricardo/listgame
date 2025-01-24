package com.wrengenharia.listgame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wrengenharia.listgame.dto.GameListDTO;
import com.wrengenharia.listgame.entities.GameList;
import com.wrengenharia.listgame.projections.GameMinProjection;
import com.wrengenharia.listgame.repositories.GameListRepository;
import com.wrengenharia.listgame.repositories.GameRepository;



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
	
	@Autowired
	private GameRepository gameRepository;
	
	/*
	 * created request and use spring transactional method to salve in the database
	 */


	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	@Transactional
	public void move ( Long listId, int sourceIndex, int destinationIndex) {
		
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for(int i = min; i <= max; i++) {
			
			gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
		
		
	}
	
	

}
