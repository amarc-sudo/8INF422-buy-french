import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-list-card-panier',
  templateUrl: './list-card-panier.component.html',
  styleUrls: ['./list-card-panier.component.css']
})
export class ListCardPanierComponent implements OnInit {

  list$: Array<product> | undefined;

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
  }

  total():number{
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    let somme = 0;
    if (this.list$) {


      // @ts-ignore
      for (let element of this.list$) {
        somme+=element.price;
      }
    }
    return somme;
  }
}
