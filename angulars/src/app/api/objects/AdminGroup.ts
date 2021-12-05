import {Person} from "./Person";
import {Group} from "./Group";

export class AdminGroup{
  idAdminGroup!: number;
  idPerson!: Person;
  idGroups!: Group | undefined;
  groupsPrivileges!: number;
}
