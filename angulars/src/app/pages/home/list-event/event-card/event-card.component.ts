import {Component, Input, OnInit, Output} from '@angular/core';
import {product} from "../../../../api/objects/product";
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-event-card',
  templateUrl: './event-card.component.html',
  styleUrls: ['./event-card.component.css']
})
export class EventCardComponent implements OnInit {

  @Input()
  product: product | any;

  @Output() productUser = new EventEmitter();

  constructor() { }

  ngOnInit(): void {}

  addPanier():void{
    console.log('panier');
    this.productUser.emit(this.product);
  }



}
