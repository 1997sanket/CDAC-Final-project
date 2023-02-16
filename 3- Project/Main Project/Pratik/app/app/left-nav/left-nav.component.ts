import { Component, OnInit } from '@angular/core';
import { BookingForm } from '../model/bookingForm';

@Component({
  selector: 'app-left-nav',
  templateUrl: './left-nav.component.html',
  styleUrls: ['./left-nav.component.css']
})
export class LeftNavComponent implements OnInit {

  states = ['Maharashtra', 'Rajasthan', 'Karnataka'];
  stateHasError = true;
  dateHasError = true;


  bookingForm: BookingForm = { state: '', checkin: null, checkout: null };

  constructor() { }

  ngOnInit(): void {
  }


  validateState(value) {
    if (value === '') this.stateHasError = true;

    else this.stateHasError = false;
  }


  onSubmit() {
    console.log(this.bookingForm);
  }


  checkDates(checkinValue, checkoutValue) {

    let checkinDate = new Date(checkinValue).getTime();
    let checkoutDate = new Date(checkoutValue).getTime();

    if (checkinDate - checkoutDate >= 0)
      this.dateHasError = true;
    else this.dateHasError = false;

    console.log(checkinDate - checkoutDate);

  }
}
