import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.css']
})
export class ListCardComponent implements OnInit {

  list$: Observable<product[]> | undefined;
  panier:Array<product> | any;

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    this.list$ = this.eventService.listEvent()
    if(localStorage.getItem('isConnect')){
      if(localStorage.getItem('panier')){

      }else{
        let products:Array<product>;
        products=new Array<product>();
        let objLinea = JSON.stringify(products);
        localStorage.setItem("panier",objLinea);
      }
    }
  }

  addToPanier($event: any, index: number) {
    console.log($event)
    let products:Array<product>;
    let objLinea;
    if(localStorage.getItem('panier')) {
      objLinea = localStorage.getItem("panier");
      products = JSON.parse(<string>objLinea);
    }else{
      products = new Array<product>();
    }
    if ($event && products[index] == null) {
      products.push($event);
    }
    objLinea = JSON.stringify(products);
    localStorage.setItem("panier",objLinea);
  }
}
