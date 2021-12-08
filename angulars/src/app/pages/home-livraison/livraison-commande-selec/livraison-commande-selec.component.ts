import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {} from 'googlemaps';
import {command} from "../../../api/objects/command";
@Component({
  selector: 'app-livraison-commande-selec',
  templateUrl: './livraison-commande-selec.component.html',
  styleUrls: ['./livraison-commande-selec.component.css']
})
export class LivraisonCommandeSelecComponent implements OnInit {


  @Input() command : command | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
