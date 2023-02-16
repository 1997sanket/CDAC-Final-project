import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { BookingForm1 } from '../model/booking-form1';


@Injectable({
  providedIn: 'root'
})
export class BookingFormService {
  url = "https://localhost:8080/";

  constructor(private http: HttpClient) { }

  //Submit Staff Login Object
  submitFindTheHotel(bookingForm: BookingForm1) {

    //return this.http.post<any>(this.url, staffLogin);
    console.log(bookingForm);
  }
}
