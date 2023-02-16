import { environment } from '../../environments/api-key'
import { Component, OnInit } from '@angular/core';
import * as mapboxgl from 'mapbox-gl';
import { MapService } from '../service/map.service';
import { Address } from '../model/address';
import { Router } from '@angular/router';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {
  map: mapboxgl.Map;
  marker = new mapboxgl.Marker({
    color: "#fa712a",
    draggable: true
    });
  style = 'mapbox://styles/mapbox/streets-v11';
  lat = 20.593683;
  lng = 78.962883;
  address:Address;
  constructor(
    private mapService:MapService,
    private router:Router
  ) { }
  ngOnInit() {
    this.address= new Address("","","","","","","","","","");
    Object.getOwnPropertyDescriptor(mapboxgl, "accessToken").set(environment.mapbox.accessToken);
      this.map = new mapboxgl.Map({
        container: 'map',
        style: this.style,
        zoom: 3,
        center: [this.lng, this.lat]
    });
    // Add map controls
    // this.map.addControl(new mapboxgl.NavigationControl());
    this.map.on('click', e=>{
      console.log(e);
      let ltt = e.lngLat.lat;
      let lng = e.lngLat.lng;
      this.mapService.getLocationDetails(ltt,lng).subscribe(data=>{
        console.log(data);
        this.address = data.address;
      });
      this.marker.remove();
      this.marker.setLngLat([lng,ltt])
        .addTo(this.map);
      
    }); 
  }
  
}
