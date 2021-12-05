import {TableData} from "./TableData";
import {Person} from "./Person";

export class Event{
  idEvent!: number ;
  createur!: Person;
  createDate!: Date;
  idStatut!: TableData;
  title!: string;
  description!: string;
}

