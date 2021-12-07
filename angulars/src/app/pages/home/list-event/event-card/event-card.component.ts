import {Component, Input, OnInit} from '@angular/core';
import {product} from "../../../../api/objects/product";
@Component({
  selector: 'app-event-card',
  templateUrl: './event-card.component.html',
  styleUrls: ['./event-card.component.css']
})
export class EventCardComponent implements OnInit {

  @Input()
  product: product | undefined;


  constructor() { }

  ngOnInit(): void {}

  addPanier():void{
    if(localStorage.getItem('panier')){
      let products:Array<product>;
      let objLinea = localStorage.getItem("panier");
      products = JSON.parse(<string>objLinea);
      if (this.product) {
        products.push(this.product);
      }
      objLinea = JSON.stringify(products);
      localStorage.setItem("panier",objLinea);
    }else {
      let products:Array<product>;
      products=new Array<product>();
      if (this.product instanceof product) {
        products.push(this.product);
      }
      let objLinea = JSON.stringify(products);
      localStorage.setItem("panier",objLinea);
    }
  }



}
