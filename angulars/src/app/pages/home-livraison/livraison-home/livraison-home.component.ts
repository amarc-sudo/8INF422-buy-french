import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-livraison-home',
  templateUrl: './livraison-home.component.html',
  styleUrls: ['./livraison-home.component.css']
})
export class LivraisonHomeComponent implements OnInit {

  constructor(private router: Router) { }

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
}
