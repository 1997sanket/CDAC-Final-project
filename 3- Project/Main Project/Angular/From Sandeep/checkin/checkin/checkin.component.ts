import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-checkin',
  templateUrl: './checkin.component.html',
  styleUrls: ['./checkin.component.css']
})
export class CheckinComponent implements OnInit {
  public bid:string = '';
  public ifBidSet:boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.bid);
    this.ifBidSet = true;
  }

}
