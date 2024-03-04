import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Players } from '../model/players.model';


@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  private baseUrl = 'http://localhost:8080/api/players/';

  constructor(private http: HttpClient) { }

  

  getAllPlayers(): Observable<Players[]> {
    return this.http.get<Players[]>(this.baseUrl+"get-all-players",{responseType:'json'});
  }

  getAllPlayersSortedByMatchesAsc(): Observable<Players[]> {
    return this.http.get<Players[]>(this.baseUrl+"get-all-sorted-by-matches-asc",{responseType:'json'});
  }
}
