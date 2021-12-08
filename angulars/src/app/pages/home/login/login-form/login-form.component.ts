import { Component, OnInit } from '@angular/core';
import {UserService} from "../../../../service/api/user.service";
import {tap} from "rxjs/operators";
// @ts-ignore
import {user} from '../../../../api/objects/user';
import {userType} from "../../../../api/objects/userType";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {
  email: any;
  password: any;
  firstName: any;
  lastName: any;
  phone: any;
  newEmail: any;
  newPassword: any;

  constructor(private userApi: UserService, private router: Router ) { }

  ngOnInit(): void {
  }


  connection() {
    this.userApi.login(this.email, this.password).pipe(tap(data => {
      if (data != null) {
        let users: user = data
        users.typeID = data.typeID;
        localStorage.setItem('isConnect', 'true');
        console.log(data)
        let objLinea = JSON.stringify(data);
        localStorage.setItem("user",objLinea);
        console.log(users.typeID)
        if( users.typeID.type == 'deliver'){
          localStorage.setItem('deliver', 'true');
          this.router.navigate(['livraison']);
        }
      } else {
        localStorage.removeItem('isConnect');
      }
    })).subscribe();
  }

  Inscription() {
    let newUser = new user();
    let newTypeUser = new userType();
    newTypeUser.type="user";
    newTypeUser.id=1;
    newUser.typeID=newTypeUser;
    newUser.mail=this.newEmail;
    newUser.phone=this.phone;
    newUser.firstName=this.firstName;
    newUser.lastName=this.lastName;
    newUser.password=this.newPassword;
    newUser.salt="ah";

    console.log(newUser);
    this.userApi.Inscription(newUser).pipe(tap(data => {})).subscribe();
  }
}
