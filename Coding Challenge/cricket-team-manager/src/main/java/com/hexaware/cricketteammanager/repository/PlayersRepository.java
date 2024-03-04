package com.hexaware.cricketteammanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.cricketteammanager.entity.Players;

@Repository
public interface PlayersRepository extends JpaRepository<Players, Integer> {

		@Query("SELECT p from Players p order by p.totalMatches ASC")
		List<Players> findAllSortedByMatchesAsc();
		
		
}
