import {Component, Input, OnInit} from '@angular/core';
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-event-card-lite',
  templateUrl: './event-card-lite.component.html',
  styleUrls: ['./event-card-lite.component.css']
})
export class EventCardLiteComponent implements OnInit {

  @Input()
  product: product | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
