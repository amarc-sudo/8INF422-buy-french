import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.css']
})
export class ListCardComponent implements OnInit {

  list$: Observable<product[]> | undefined;
  panier:Array<product> | any;

  constructor(private eventService: EventService,private _snackBar: MatSnackBar) { }

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
    if(localStorage.getItem('isConnect')) {
      let products: Array<product>;
      let objLinea;
      if (localStorage.getItem('panier')) {
        objLinea = localStorage.getItem("panier");
        products = JSON.parse(<string>objLinea);
      } else {
        products = new Array<product>();
      }
      if ($event) {
        products.push($event);
      }
      objLinea = JSON.stringify(products);
      localStorage.setItem("panier", objLinea);
    } else {
      this._snackBar.open('Veuillez vous connecter pour remplir un panier', 'x',{duration: 5 * 1000,});
    }
  }
}
