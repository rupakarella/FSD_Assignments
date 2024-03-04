package com.hexaware.cricketteammanager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
public class Players {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="player_seq_generator")
	private int playerId;
	
	@NotBlank(message = "Player name is required")
	private String playerName;
	
	@NotNull(message = "Jersey number is required")
    @Positive(message = "Jersey number must be a positive number")
	private int jerseyNumber;
	
	@NotBlank(message = "Role is required")
	private String role;
	
	@NotNull(message = "Total matches is required")
	@Positive(message = "Total matches must be a positive number")
	private int totalMatches;
	
	@NotBlank(message = "Team name is required")
	private String teamName;
	
	@NotBlank(message = "Country/State name is required")
	private String countryName;
	
	@Size(max = 1000, message = "Description must be less than 1000 characters")
    private String description;

	public Players() {
		super();
	}

	public Players(int playerId, @NotBlank(message = "Player name is required") String playerName,
			@NotNull(message = "Jersey number is required") @Positive(message = "Jersey number must be a positive number") int jerseyNumber,
			@NotBlank(message = "Role is required") String role,
			@NotNull(message = "Total matches is required") @Positive(message = "Total matches must be a positive number") int totalMatches,
			@NotBlank(message = "Team name is required") String teamName,
			@NotBlank(message = "Country/State name is required") String countryName,
			@Size(max = 1000, message = "Description must be less than 1000 characters") String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", countryName="
				+ countryName + ", description=" + description + "]";
	}
	
	
}
