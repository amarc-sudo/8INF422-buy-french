import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  isConnect() {
    if(localStorage.getItem("isConnect"))
      return true
    else
      return false
  }

  Deconnexion():void{
    localStorage.removeItem("user");
    localStorage.removeItem("isConnect");
  }

}
