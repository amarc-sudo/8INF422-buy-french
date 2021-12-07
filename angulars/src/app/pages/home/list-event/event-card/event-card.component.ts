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
      console.log("dejq un panier");
      console.log(this.product);
      let products:Array<product>;
      let objLinea = localStorage.getItem("panier");
      products = JSON.parse(<string>objLinea);
      console.log(products);

      if (this.product) {
        products.push(this.product);
      }
        console.log(products);


      objLinea = JSON.stringify(products);
      localStorage.setItem("panier",objLinea);
    }else {
      console.log(this.product);
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
