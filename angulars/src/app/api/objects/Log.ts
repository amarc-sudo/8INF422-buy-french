import {Person} from "@angular/cli/utilities/package-json";
import {TableData} from "./TableData";

export class Log{
  idLog : number;
  dateLog : Date;
  ip : string;
  idPerson : Person;
  idTypeLogs : TableData;
  description : string;
  labels : string;
}
