import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { 
    console.log('UserService object created');
  }
  users: User[] =[{"uid":101, "username":"Dev","email":"dev@gmail.com","address":"Tanuku" },
  {"uid":102, "username":"Rupa","email":"rupa@gmail.com","address":"Tanuku" },
  {"uid":103, "username":"Mohan","email":"mohan@gmail.com","address":"Tanuku" },
  {"uid":104, "username":"Kusuma","email":"kusuma@gmail.com","address":"Tanuku" }];
  getAllUsers(){
    console.log("getAllUsers() called");
    return this.users;
    
  }
}
