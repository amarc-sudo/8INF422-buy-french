import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {product} from "../../../../api/objects/product";
@Component({
  selector: 'app-event-card-panier',
  templateUrl: './event-card-panier.component.html',
  styleUrls: ['./event-card-panier.component.css']
})
export class EventCardPanierComponent implements OnInit {
  @Input()
  product: product | undefined;

  @Output() removeFromPaniers = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }

  removePanier():void{
    console.log('clickOnRemove')
    this.removeFromPaniers.emit();
  }
}
