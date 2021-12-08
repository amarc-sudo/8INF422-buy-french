import {Component, Input, OnInit, ViewChild} from '@angular/core';
import {} from 'googlemaps';
import {command} from "../../../api/objects/command";
import {GoogleMap} from "@angular/google-maps";
@Component({
  selector: 'app-livraison-commande-selec',
  templateUrl: './livraison-commande-selec.component.html',
  styleUrls: ['./livraison-commande-selec.component.css']
})
export class LivraisonCommandeSelecComponent implements OnInit {


  directionsDisplay = new google.maps.DirectionsRenderer();
  directionsService = new google.maps.DirectionsService();
  marker = {
    position: { lat: 48.42945753317865, lng: -71.05447288192586 },
  }
  marker2 = {
    position: { lat: 48.420082000849604,  lng: -71.05320127515539 },
  }
  mapOptions: google.maps.MapOptions = {
    center: { lat: 48.4248013000852, lng: -71.05849093405284 },
    zoom : 14
  }
  @ViewChild(GoogleMap) map!: GoogleMap;



  @Input() command : command | undefined;
  constructor() { }

  ngOnInit(): void {
  }

}
