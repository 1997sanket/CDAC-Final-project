import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { IDisplayTheHotel } from '../model/idisplay-the-hotel';
import { FindTheHotelService } from '../service/find-the-hotel.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-display-the-hotels',
  templateUrl: './display-the-hotels.component.html',
  styleUrls: ['./display-the-hotels.component.css']
})
export class DisplayTheHotelsComponent implements OnInit {
  hotel: IDisplayTheHotel;

  constructor(private service: FindTheHotelService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {

    let pinString = this.activatedRoute.snapshot.params["pin"];

   let pin = parseInt(pinString);


    this.service.getHotelByPinCode(pin).subscribe(data => this.hotel = data);

  }
  forward(id:any){
    this.router.navigate(['/booking-form',id]);
  }

}
