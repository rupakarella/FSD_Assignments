package com.hexaware.cricketteammanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.cricketteammanager.dto.PlayersDTO;
import com.hexaware.cricketteammanager.entity.Players;
import com.hexaware.cricketteammanager.service.IPlayersService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayersRestController {
	@Autowired
    private IPlayersService playersService;
	
	@PostMapping("/create-player")
	public Players createPlayer(@RequestBody PlayersDTO playersDTO)
	{
		return playersService.createPlayer(playersDTO);
	}
	@PutMapping("/update-player/{playerId}")
	public Players updatePlayer(@PathVariable int playerId, @RequestBody PlayersDTO playersDTO)
	{
		return playersService.updatePlayer(playersDTO);
	}
	@DeleteMapping("/remove-player-by-id/{playerId}")
	public String removePlayer(@PathVariable int playerId)
	{
		return playersService.removePlayerbyId(playerId);
	}
	@GetMapping("/get-player-by-id/{playerId}")
	public PlayersDTO getPlayerById(@PathVariable int playerId)
	{
		return playersService.getPlayerById(playerId);
	}
	@GetMapping("/get-all-players")
	public List<Players> getAllPlayers()
	{
		return playersService.getAllPlayers();
	}
	@GetMapping("/get-all-sorted-by-matches-asc")
	public List<Players> findAllSortedByMatchesAsc()
	{
		return playersService.findAllSortedByMatchesAsc();
	}
	

}
