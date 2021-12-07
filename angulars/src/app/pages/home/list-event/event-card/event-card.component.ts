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

  ngOnInit(): void {

  }

}
