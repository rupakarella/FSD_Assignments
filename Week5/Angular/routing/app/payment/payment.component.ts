import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {
  totalBill=0;
  constructor(private route: ActivatedRoute)
  {

  }
  ngOnInit()
  {
    this.route.params.subscribe(params=>this.totalBill=params['billAmount']); 
  }
}
