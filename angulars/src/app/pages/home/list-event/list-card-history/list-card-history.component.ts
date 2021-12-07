import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {EventService} from "../../../../service/api/event.service";
import {command} from "../../../../api/objects/command";
import {element} from "protractor";
import {product} from "../../../../api/objects/product";

@Component({
  selector: 'app-list-card-history',
  templateUrl: './list-card-history.component.html',
  styleUrls: ['./list-card-history.component.css']
})
export class ListCardHistoryComponent implements OnInit {


  list$: Observable<command[]> | undefined;
  listProd: Observable<product[]> | undefined;

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    this.list$ = this.eventService.listCommand()

  }

}
