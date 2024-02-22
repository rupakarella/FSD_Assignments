import { Component } from '@angular/core';

@Component({
  selector: 'app-employee',
  template: '<h1>Hello I am Employee</h1>',
  styles: ['h1{color:plum}']
})
export class EmployeeComponent {

  eid:number= 111;
  ename:string = "Rupa";
  salary:number=50000;

}
