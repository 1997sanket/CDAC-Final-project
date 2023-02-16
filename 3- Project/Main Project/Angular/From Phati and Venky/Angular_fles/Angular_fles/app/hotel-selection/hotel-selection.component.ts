import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Hotel } from '../model/hotel';
import { IHotel } from '../model/ihotel';
import { HotelSearchService } from '../service/hotel-search.service';

@Component({
  selector: 'app-hotel-selection',
  templateUrl: './hotel-selection.component.html',
  styleUrls: ['./hotel-selection.component.css']
})
export class HotelSelectionComponent implements OnInit {
  hotels:IHotel[];
  constructor(
    private hotelSearchService : HotelSearchService,
    private activatedRoute: ActivatedRoute
  ) { }

  ngOnInit(): void {
    let state:string= this.activatedRoute.snapshot.params['state'];
    this.hotelSearchService.findHotelByState(state).subscribe(data=>{
      this.hotels=data;
    });
  }

}
