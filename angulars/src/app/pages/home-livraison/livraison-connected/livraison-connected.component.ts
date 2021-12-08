import {Component, OnInit, Output} from '@angular/core';
import {Observable} from "rxjs";
import {command} from "../../../api/objects/command";
import {CommandService} from "../../../service/api/command.service";
import {user} from "../../../api/objects/user";
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-livraison-connected',
  templateUrl: './livraison-connected.component.html',
  styleUrls: ['./livraison-connected.component.css']
})
export class LivraisonConnectedComponent implements OnInit {

  constructor(private commandService : CommandService) { }

  list$: Observable<command[]> | undefined;


  @Output() emit = new EventEmitter<command>()

  userConnected: user | undefined;
  ngOnInit(): void {
    this.list$ = this.commandService.listCommandAll()
    let objLinea = localStorage.getItem("user");
    this.userConnected = JSON.parse(<string>objLinea);
  }

  onClick(command :command){
    this.emit.emit(command);
  }

}
