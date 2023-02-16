import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IBooking } from '../model/ibooking';

@Injectable({
  providedIn: 'root'
})
export class BookRoomService {

  constructor(
    private _http:HttpClient
  ) { }

  bookUrl:string="http://localhost:8081/booking"


  postBooking(booking:IBooking):Observable<IBooking>{
    return this._http.post<IBooking>(this.bookUrl,booking);    
  }

  getBooking(bookingId:number):Observable<IBooking>{
    return this._http.get<IBooking>(this.bookUrl+"/"+bookingId);    
  }

  
}
