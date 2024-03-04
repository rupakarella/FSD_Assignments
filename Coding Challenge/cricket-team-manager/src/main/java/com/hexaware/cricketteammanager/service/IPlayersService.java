package com.hexaware.cricketteammanager.service;

import java.util.List;

import com.hexaware.cricketteammanager.dto.PlayersDTO;
import com.hexaware.cricketteammanager.entity.Players;

public interface IPlayersService {
	public Players createPlayer(PlayersDTO playersDTO);
	public Players updatePlayer(PlayersDTO playersDTO);
	public String removePlayerbyId(int playerId);
	public PlayersDTO getPlayerById(int playerId);
	public List<Players> getAllPlayers();
	public List<Players> findAllSortedByMatchesAsc();

	   
}
