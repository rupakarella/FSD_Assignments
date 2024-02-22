import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import {User} from './user'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  //providers: [UserService]
})
export class AppComponent implements OnInit{
  title = 'webapp';

  object:Object=
  {foo:'bar',baz:'qux'};
  userList:User[]=[];
  constructor(private userService:UserService)
   { 
  console.log('component class object created');   }
   ngOnInit(): void{
    console.log('ngOnInit');
    this.getAll();
  }
   getAll()
   {
    this.userList=this.userService.getAllUsers();
   }
}
