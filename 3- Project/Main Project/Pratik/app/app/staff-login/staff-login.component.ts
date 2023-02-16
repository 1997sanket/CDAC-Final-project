import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StaffLogin } from '../model/staff-login';
import { StaffLoginService } from '../service/staff-login.service';

@Component({
  selector: 'app-staff-login',
  templateUrl: './staff-login.component.html',
  styleUrls: ['./staff-login.component.css']
})
export class StaffLoginComponent implements OnInit {

  login: StaffLogin = { hotelCode: '', username: '', password: '' };
  static loginTries = 0;



  constructor(private service: StaffLoginService, private router: Router) { }

  ngOnInit() {

  }


  public onSubmit() {

    //Dummy
    if (this.login.hotelCode == 'H1' && this.login.username == 'root' && this.login.password == 'aA@1') {
      localStorage.setItem('token', this.login.username);
      console.log('token stored in localStorage = ' + this.login.username);


      this.service.submitStaffLogin(this.login);
      this.router.navigate(['/home']);
    }

    else {

      StaffLoginComponent.loginTries++;
    }


  }
}
