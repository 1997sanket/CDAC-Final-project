import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BookingForm1 } from '../model/booking-form1';
import { BookingFormService } from '../service/booking-form.service';



@Component({
  selector: 'app-booking-form',
  templateUrl: './booking-form.component.html',
  styleUrls: ['./booking-form.component.css']
})
export class BookingFormComponent implements OnInit {
  dateHasError = true;

  bookingForm: BookingForm1 = { firstName:'',surname:'',address:'',mobile:null,checkin:null,checkout:null,credit:null};
  constructor(private service: BookingFormService, private router: Router) { }

  ngOnInit() {

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
