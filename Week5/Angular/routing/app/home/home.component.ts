import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
bill:number = 5000;
constructor(private router: Router)
{

}


  doPayment()
  {
    console.log("navigating from home to payment...");
    this.router.navigate(['/payment/'+this.bill]);
  }
}
