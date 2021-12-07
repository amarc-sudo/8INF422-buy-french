import {seller} from "./seller";


export class product{
id !: number;
name !: string;
description!: string;
price !: number;
photo!:string;
nutritionalValue!: string;
idSeller!:seller;
}
