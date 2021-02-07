import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class DateService {
  constructor(private http: HttpClient) {}

  //dateNow: string[];
  getDate() {
    return this.http.get("http://exam-stone.jacksonmanila.com:9000/api/all");
    //return this.http.get("https://jsonplaceholder.typicode.com/comments");
  }
}
