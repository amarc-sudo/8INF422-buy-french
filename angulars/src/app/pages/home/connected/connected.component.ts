import { Component, OnInit } from '@angular/core';
import {user} from "../../../api/objects/User";
import {Router} from "@angular/router";

@Component({
  selector: 'app-connected',
  templateUrl: './connected.component.html',
  styleUrls: ['./connected.component.css']
})
export class ConnectedComponent implements OnInit {

  // @ts-ignore
  userConnected: user;

  constructor(private router:Router ) {}

  ngOnInit(): void {
    let objLinea = localStorage.getItem("user");
    this.userConnected = JSON.parse(<string>objLinea);
  }
}
