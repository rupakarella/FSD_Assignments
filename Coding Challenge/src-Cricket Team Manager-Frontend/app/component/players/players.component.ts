import { Component, OnInit } from '@angular/core';
import { Players } from 'src/app/model/players.model';
import { PlayerService } from 'src/app/service/players.service';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent implements OnInit {
  players: Players[] = [];

  constructor(private playersService: PlayerService) { }
  ngOnInit(): void {
    this.getAllPlayers();
  
  }
  
  getAllPlayers() {
    this.playersService.getAllPlayers().subscribe(players => {
      this.players = players;
    });
  }
  
  getAllPlayersSortedByMatchesAsc() {
    this.playersService.getAllPlayersSortedByMatchesAsc().subscribe(players => {
      this.players = players;
    });
  }  
  
  
}

