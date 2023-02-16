import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { IHotel } from '../model/ihotel';
import { IState } from '../model/istate';

@Injectable({
  providedIn: 'root'
})
export class HotelSearchService {

  constructor(
    private _http:HttpClient
  ) { }

  stateUrl:string = "http://localhost:8081/hotels/state/";
  cityUrl:string = "http://localhost:8081/hotels/city/";
  idUrl:string = "http://localhost:8081/hotels/";
  

  findHotelByState(state:string):Observable<IHotel[]>{
    return this._http.get<IHotel[]>(this.stateUrl+state);
  }

  findHotelById(id:number):Observable<IHotel>{
    return this._http.get<IHotel>(this.idUrl+id);
  }

  findHotelByCity(city:string):Observable<IHotel[]>{
    return this._http.get<IHotel[]>(this.cityUrl+city);
  }

  findSates():Observable<IState[]>{
    return this._http.get<IState[]>("http://localhost:8081/states");
  }
}
