import { Component, OnInit } from '@angular/core';
import {UserService} from "../../../../service/api/user.service";
import {tap} from "rxjs/operators";

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  email: any;
  password: any;

  constructor(private userApi: UserService ) { }

  ngOnInit(): void {
  }


  connection() {
    this.userApi.login(this.email, this.password).pipe(tap(data => {
      if (data != null) {
        localStorage.setItem('isConnect', 'true');
        console.log(data)
        let objLinea = JSON.stringify(data);
        localStorage.setItem("user",objLinea);
      } else {
        localStorage.removeItem('isConnect');
      }
    })).subscribe();
  }
}
