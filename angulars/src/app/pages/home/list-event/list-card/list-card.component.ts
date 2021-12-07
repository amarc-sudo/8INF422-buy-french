import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.css']
})
export class ListCardComponent implements OnInit {

  list$: Observable<product[]> | undefined;

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    this.list$ = this.eventService.listEvent()
  }
}
