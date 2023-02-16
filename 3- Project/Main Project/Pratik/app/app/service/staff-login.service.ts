import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { StaffLogin } from '../model/staff-login';

@Injectable({
  providedIn: 'root'
})
export class StaffLoginService {

  url = "https://localhost:8080/";

  constructor(private http: HttpClient) { }

  //Submit Staff Login Object
  submitStaffLogin(staffLogin: StaffLogin) {

    //return this.http.post<any>(this.url, staffLogin);
    console.log(staffLogin);
  }
}
