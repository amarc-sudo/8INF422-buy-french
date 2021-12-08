import {Component, OnInit, Output} from '@angular/core';
import {EventService} from "../../../../service/api/event.service";
import {Observable} from "rxjs";
import {product} from "../../../../api/objects/product";
import {waitForAsync} from "@angular/core/testing";
import {command} from "../../../../api/objects/command";
import {CommandService} from "../../../../service/api/command.service";
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-list-card-panier',
  templateUrl: './list-card-panier.component.html',
  styleUrls: ['./list-card-panier.component.css']
})
export class ListCardPanierComponent implements OnInit {

  list$: Array<product> | undefined;
  @Output() sendPanier = new EventEmitter();
  constructor(private eventService: EventService, private commandService: CommandService) { }

  ngOnInit(): void {
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    console.log(this.list$);
  }
  consolelog(data:any){
    console.log(data);
  }

  removeFromPanier(index: number){
    console.log(index)
    console.log('removePanier');
    let products:Array<product>;
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    // @ts-ignore
    console.log(this.list$[index]);
    // @ts-ignore
    if (this.list$[index] != null)
      { // @ts-ignore
        if (index > -1) {
          // @ts-ignore
          this.list$.splice(index, 1);
        }
      }
    objLinea = JSON.stringify(this.list$);
    localStorage.setItem("panier",objLinea);
  }

  total():number{
    let objLinea = localStorage.getItem("panier");
    this.list$ = JSON.parse(<string>objLinea);
    let somme = 0;
    if (this.list$) {
      // @ts-ignore
      for (let element of this.list$) {
        if(element)
          somme+=element.price;
      }
    }
    return somme;
  }

  commander(): void{
    let commands: command = new command();

    commands.date = new Date();
    let objLinea = localStorage.getItem("user");
    commands.idUser = JSON.parse(<string>objLinea);
    objLinea = localStorage.getItem("panier");
    commands.products = JSON.parse(<string>objLinea);
    localStorage.removeItem('panier');
    this.commandService.saveCommand(commands).subscribe();
    this.sendPanier.emit();
  }
}
