import { Component, OnInit } from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {Event} from "../../../../api/objects/Event";

@Component({
  selector: 'app-list-card',
  templateUrl: './list-card.component.html',
  styleUrls: ['./list-card.component.css']
})
export class ListCardComponent implements OnInit {

  list$: Observable<Event[]> | undefined;

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    this.list$ = this.eventService.listEvent()
  }
}
