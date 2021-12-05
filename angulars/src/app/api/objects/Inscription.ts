import {TableData} from "./TableData";
import {Person} from "@angular/cli/utilities/package-json";

export class Inscription{
  idEvent : number | undefined;
  idPerson : Person | undefined;
  idStatus : TableData | undefined;
  inscriptionDate : Date | undefined;
}
