import {Component, OnInit, ViewChild} from '@angular/core';
import {user} from "../../../api/objects/user";
import {Router} from "@angular/router";
import {ListCardHistoryComponent} from "../list-event/list-card-history/list-card-history.component";
import {MatTabChangeEvent} from "@angular/material/tabs";

@Component({
  selector: 'app-connected',
  templateUrl: './connected.component.html',
  styleUrls: ['./connected.component.css']
})
export class ConnectedComponent implements OnInit {

  // @ts-ignore
  userConnected: user;
  refresh: boolean = false;

  constructor(private router:Router ) {}

  ngOnInit(): void {
    let objLinea = localStorage.getItem("user");
    this.userConnected = JSON.parse(<string>objLinea);
  }

  refreshCommand() {
    console.log('change')
    this.refresh = true;
  }
}
