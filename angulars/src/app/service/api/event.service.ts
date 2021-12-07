import { Injectable } from '@angular/core';
import {ParentApiService} from "./parent.api.service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";

@Injectable({
  providedIn: 'root'
})
export class EventService extends ParentApiService {

  constructor( private httpClient: HttpClient) {
    super();
  }

  listEvent(): Observable<Event[]> {
    return this.httpClient.get<Event[]>(environment.apiUrl + '/rest/api/event/getAll');
  }

}
