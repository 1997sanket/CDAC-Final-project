import { Component, OnInit } from '@angular/core';
import {ContactUs} from "./contact-us.model";


@Component({
  selector: 'app-contact-us',
  templateUrl: './contact-us.component.html',
  styleUrls: ['./contact-us.component.css']
})
export class ContactUsComponent implements OnInit {
  contactus: ContactUs = new ContactUs;
  constructor() { }

  ngOnInit(): void {
  }

  onsubmit(){
    console.log(this.contactus);
  }

}
