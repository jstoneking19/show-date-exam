import { Component } from "@angular/core";
import { DateService } from "./date.service";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styleUrls: ["./app.component.css"]
})
export class AppComponent {
  date: any = [];
  constructor(private dateService: DateService) {}
  
  ngOnInit() {
    this.dateService.getDate().subscribe(date => {
      this.date.push(date);
    });
  }
}
