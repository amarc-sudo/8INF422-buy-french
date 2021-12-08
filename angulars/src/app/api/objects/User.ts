import {userType} from "./userType";

export class user{
id!:number;
firstName!:string;
lastName!:string;
salt!:string;
password!:string;
mail!:string;
phone!:string;
typeId!:userType;
}
