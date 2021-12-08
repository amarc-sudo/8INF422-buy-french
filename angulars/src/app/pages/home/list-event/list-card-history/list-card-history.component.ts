import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {EventService} from "../../../../service/api/event.service";
import {command} from "../../../../api/objects/command";
import {element} from "protractor";
import {product} from "../../../../api/objects/product";
import {user} from "../../../../api/objects/User";
import {CommandService} from "../../../../service/api/command.service";

@Component({
  selector: 'app-list-card-history',
  templateUrl: './list-card-history.component.html',
  styleUrls: ['./list-card-history.component.css']
})
export class ListCardHistoryComponent implements OnInit {


  list$: Observable<command[]> | undefined;
  listProd: Observable<product[]> | undefined;
// @ts-ignore
  userConnected: user;


  constructor(private commandService: CommandService) { }

  ngOnInit(): void {
    let objLinea = localStorage.getItem("user");
    console.log('test');
    this.userConnected = JSON.parse(<string>objLinea);
    this.list$ = this.commandService.listCommand(this.userConnected);
  }

}
