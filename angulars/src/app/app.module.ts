import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HomepageComponent } from './pages/home/homepage/homepage.component';
import { LoginFormComponent } from './pages/home/login/login-form/login-form.component';
import { EventCardComponent } from './pages/home/list-event/event-card/event-card.component';
import {RouterModule} from "@angular/router";
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatInputModule} from "@angular/material/input";
import {MatButtonModule} from "@angular/material/button";
import {MatCardModule} from "@angular/material/card";
import { ListCardComponent } from './pages/home/list-event/list-card/list-card.component';
import {HttpClientModule} from "@angular/common/http";
import { ConnectedComponent } from './pages/home/connected/connected.component';
import {MatTabsModule} from "@angular/material/tabs";
import {MatSlideToggleModule} from "@angular/material/slide-toggle";
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatSelectModule} from "@angular/material/select";
import {MatOptionModule} from "@angular/material/core";
import {MatExpansionModule} from "@angular/material/expansion";
import { EventCardLiteComponent } from './pages/home/list-event/event-card-lite/event-card-lite.component';
import { EventCardPanierComponent } from './pages/home/list-event/event-card-panier/event-card-panier.component';
import { TestComponent } from './pages/home/test/test.component';
import { LivraisonConnectionComponent } from './pages/home-livraison/livraison-connection/livraison-connection.component';
import { LivraisonConnectedComponent } from './pages/home-livraison/livraison-connected/livraison-connected.component';
import { LivraisonHomeComponent } from './pages/home-livraison/livraison-home/livraison-home.component';
import { LivraisonCommandeSelecComponent } from './pages/home-livraison/livraison-commande-selec/livraison-commande-selec.component';
import { EventCardLivraisonComponent } from './pages/home/list-event/event-card-livraison/event-card-livraison.component';
import { LivraisonHomeDisconnectedComponent } from './pages/home-livraison/livraison-home-disconnected/livraison-home-disconnected.component';
import {ListCardPanierComponent} from "./pages/home/list-event/list-card-panier/list-card-panier.component";

import { GoogleMapsModule } from '@angular/google-maps'
import {FormsModule} from "@angular/forms";
@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    LoginFormComponent,
    EventCardComponent,
    ListCardComponent,
    ListCardPanierComponent,
    ConnectedComponent,
    EventCardLiteComponent,
    EventCardPanierComponent,
    TestComponent,
    LivraisonConnectionComponent,
    LivraisonConnectedComponent,
    LivraisonHomeComponent,
    LivraisonCommandeSelecComponent,
    EventCardLivraisonComponent,
    LivraisonHomeDisconnectedComponent

  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {
        path: '',
        component: HomepageComponent
      },
      {
        path: 'livraison',
        component: LivraisonHomeComponent
      },
    ]),
    NgbModule,
    BrowserAnimationsModule,
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatCardModule,
    HttpClientModule,
    MatTabsModule,
    MatSlideToggleModule,
    MatToolbarModule,
    MatSelectModule,
    MatOptionModule,
    MatExpansionModule,
    GoogleMapsModule,
    FormsModule,
  ],
  providers: [ HttpClientModule ],
  bootstrap: [AppComponent]
})
export class AppModule { }
