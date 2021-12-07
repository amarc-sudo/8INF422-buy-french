import {Component, Input, OnInit} from '@angular/core';
import {product} from "../../../../api/objects/product";
@Component({
  selector: 'app-event-card-livraison',
  templateUrl: './event-card-livraison.component.html',
  styleUrls: ['./event-card-livraison.component.css']
})
export class EventCardLivraisonComponent implements OnInit {
  @Input()
  product: product | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
