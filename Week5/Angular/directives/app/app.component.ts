import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  num1:string="";
  tech:string="";
  arr:number[]=[1,2,3,4,5,6,7,8,9];
  textColor='brown';
  backgroundColor='plum';
  isSpecial=true;
}
