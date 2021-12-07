import { Injectable } from '@angular/core';
import {ParentApiService} from "./parent.api.service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {product} from "../../api/objects/product";

@Injectable({
  providedIn: 'root'
})
export class EventService extends ParentApiService {

  constructor( private httpClient: HttpClient) {
    super();
  }

  listEvent(): Observable<product[]> {
    return this.httpClient.get<product[]>(environment.apiUrl + '/rest/api/product/getAll');
  }

}
