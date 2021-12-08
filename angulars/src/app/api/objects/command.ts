import {product} from "./product";
import {user} from "./user";

export class command{
id!: number;
idUser!: user;
date!: Date;
idDeliver!: number;
products!: product[];
}
