import {Component, Input, OnInit} from '@angular/core';
import {product} from "../../../../api/objects/product";
@Component({
  selector: 'app-event-card-panier',
  templateUrl: './event-card-panier.component.html',
  styleUrls: ['./event-card-panier.component.css']
})
export class EventCardPanierComponent implements OnInit {
  @Input()
  product: product | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
