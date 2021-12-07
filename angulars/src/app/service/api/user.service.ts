import { Injectable } from '@angular/core';
import {ParentApiService} from "./parent.api.service";
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {environment} from "../../../environments/environment";
import {product} from "../../api/objects/product";
import {user} from "../../api/objects/User";

@Injectable({
  providedIn: 'root'
})
export class UserService extends ParentApiService {

  constructor( private httpClient: HttpClient) {
    super();
  }

  login(email: string, password: string): Observable<user> {
    return this.httpClient.post<user>(environment.apiUrl + '/rest/api/user/login', {
      email,
      password
    });
  }

}
