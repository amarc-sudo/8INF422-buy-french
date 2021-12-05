import {Component, Input, OnInit} from '@angular/core';
import {Event} from "../../../../api/objects/Event";

@Component({
  selector: 'app-event-card',
  templateUrl: './event-card.component.html',
  styleUrls: ['./event-card.component.css']
})
export class EventCardComponent implements OnInit {

  @Input()
  event: Event | undefined;

  constructor() { }

  ngOnInit(): void {

  }

}
