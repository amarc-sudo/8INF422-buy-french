import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {command} from "../../../api/objects/command";

@Component({
  selector: 'app-livraison-home',
  templateUrl: './livraison-home.component.html',
  styleUrls: ['./livraison-home.component.css']
})
export class LivraisonHomeComponent implements OnInit {

  constructor(private router: Router) { }
  selectedCommand : command | undefined;

  ngOnInit(): void {
  }

  connect() {
    if(localStorage.getItem('deliver')){
      return true
    } else
      return false
  }

  Deconnexion():void{
    localStorage.removeItem("user");
    localStorage.removeItem("isConnect");
    localStorage.removeItem('deliver')
    this.router.navigate(['/'])
  }

  sendToChild($event: command) {
    this.selectedCommand = $event;
  }
}
