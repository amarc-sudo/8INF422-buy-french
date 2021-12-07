import {Component, Input, OnInit} from '@angular/core';

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
