import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";
import {waitForAsync} from "@angular/core/testing";

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
    console.log(this.list$);
  }
  consolelog(data:any){
    console.log(data);
  }

  removeFromPanier(index: number){
    console.log(index)
    console.log('removePanier');
    let products:Array<product>;
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    // @ts-ignore
    console.log(this.list$[index]);
    // @ts-ignore
    if (this.list$[index] != null)
      { // @ts-ignore
        if (index > -1) {
          // @ts-ignore
          this.list$.splice(index, 1);
        }
      }
    objLinea = JSON.stringify(this.list$);
    localStorage.setItem("panier",objLinea);
  }

  total():number{
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    let somme = 0;
    if (this.list$) {
      // @ts-ignore
      for (let element of this.list$) {
        if(element)
          somme+=element.price;
      }
    }
    return somme;
  }
}
