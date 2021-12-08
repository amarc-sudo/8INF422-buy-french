import {Component, Input, OnInit} from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-list-card-livraison',
  templateUrl: './list-card-livraison.component.html',
  styleUrls: ['./list-card-livraison.component.css']
})
export class ListCardLivraisonComponent implements OnInit {

  list$: Array<product> | undefined;
  @Input() products : Array<product> | undefined;
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
