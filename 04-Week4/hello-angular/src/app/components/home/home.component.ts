import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  //your component view can be 
  template: `<h1>Hey! This is my home component!!!</h1>`,
  //templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  name = 'Genesis';
  count = 0;
  time: Date;
  colorProp = 'blue';

  constructor() {
    setInterval(
      () => {
        this.time = new Date();
      }, 1000);
  }

  ngOnInit() {
  }




}
