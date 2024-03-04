package com.hexaware.cricketteammanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.cricketteammanager.dto.PlayersDTO;
import com.hexaware.cricketteammanager.entity.Players;
import com.hexaware.cricketteammanager.exception.PlayerNotFoundException;
import com.hexaware.cricketteammanager.repository.PlayersRepository;
@Service
public class PlayersServiceImp implements IPlayersService {
	@Autowired
	PlayersRepository playersRepo;
	
	@Override
	public Players createPlayer(PlayersDTO playersDTO) {
		Players player=new Players();
		player.setPlayerId(playersDTO.getPlayerId());
		player.setPlayerName(playersDTO.getPlayerName());
		player.setJerseyNumber(playersDTO.getJerseyNumber());
		player.setRole(playersDTO.getRole());
		player.setTotalMatches(playersDTO.getTotalMatches());
		player.setTeamName(playersDTO.getTeamName());
		player.setCountryName(playersDTO.getCountryName());
		player.setDescription(playersDTO.getDescription());
		return playersRepo.save(player);
	}

	@Override
	public Players updatePlayer(PlayersDTO playersDTO) {
		Players player = playersRepo.findById(playersDTO.getPlayerId())
                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + playersDTO.getPlayerId()));
		player.setPlayerId(playersDTO.getPlayerId());
		player.setPlayerName(playersDTO.getPlayerName());
		player.setJerseyNumber(playersDTO.getJerseyNumber());
		player.setRole(playersDTO.getRole());
		player.setTotalMatches(playersDTO.getTotalMatches());
		player.setTeamName(playersDTO.getTeamName());
		player.setCountryName(playersDTO.getCountryName());
		player.setDescription(playersDTO.getDescription());
		return playersRepo.save(player);
	}

	@Override
	public String removePlayerbyId(int playerId) {
		Players playerToDelete = playersRepo.findById(playerId)
	            .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + playerId));
	    playersRepo.delete(playerToDelete);
	    return "Player removed";
	}

	@Override
	public PlayersDTO getPlayerById(int playerId) {
		Players player = playersRepo.findById(playerId)
                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + playerId));
        PlayersDTO playerDTO = new PlayersDTO();
        playerDTO.setPlayerId(player.getPlayerId());
        playerDTO.setPlayerName(player.getPlayerName());
        playerDTO.setJerseyNumber(player.getJerseyNumber());
        playerDTO.setRole(player.getRole());
        playerDTO.setTotalMatches(player.getTotalMatches());
        playerDTO.setTeamName(player.getTeamName());
        playerDTO.setCountryName(player.getCountryName());
        playerDTO.setDescription(player.getDescription());
        return playerDTO;
		
	}

	@Override
	public List<Players> getAllPlayers() {
		return playersRepo.findAll();
	}

	@Override
	public List<Players> findAllSortedByMatchesAsc() {	
		return playersRepo.findAllSortedByMatchesAsc();
	}
	
	

}
