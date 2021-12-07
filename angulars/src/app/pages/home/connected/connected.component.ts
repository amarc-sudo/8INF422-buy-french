import { Component, OnInit } from '@angular/core';
import {user} from "../../../api/objects/User";

@Component({
  selector: 'app-connected',
  templateUrl: './connected.component.html',
  styleUrls: ['./connected.component.css']
})
export class ConnectedComponent implements OnInit {

  // @ts-ignore
  userConnected: user;

  constructor() { }

  ngOnInit(): void {
    let objLinea = localStorage.getItem("user");
    this.userConnected = JSON.parse(<string>objLinea);
  }

}
