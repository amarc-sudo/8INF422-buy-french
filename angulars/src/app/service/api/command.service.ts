import { Injectable } from '@angular/core';
import {ParentApiService} from "./parent.api.service";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {product} from "../../api/objects/product";
import {user} from "../../api/objects/User";
import {command} from "../../api/objects/command";

@Injectable({
  providedIn: 'root'
})
export class CommandService extends ParentApiService {

  constructor( private httpClient: HttpClient) {
    super();
  }

  listCommand(users:user): Observable<Array<command>> {
    let headers: HttpHeaders = new HttpHeaders();
    headers = headers.append('Accept', 'application/json');
    return this.httpClient.post<Array<command>>(environment.apiUrl + '/rest/api/Command/getHistory',users);
  }

  saveCommand(commands:command): Observable<void> {
    return this.httpClient.post<void>(environment.apiUrl + '/rest/api/Command/save',commands);
  }

}
