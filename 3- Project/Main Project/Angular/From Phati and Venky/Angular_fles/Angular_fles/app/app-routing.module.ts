import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { HomeComponent } from './home/home.component';
import { HotelSelectionComponent } from './hotel-selection/hotel-selection.component';
import { MapComponent } from './map/map.component';
import { StaffLoginService } from './service/staff-login.service';
import { StaffBookingComponent } from './staff-booking/staff-booking.component';
import { StaffCancellationComponent } from './staff-cancellation/staff-cancellation.component';
import { StaffCheckinComponent } from './staff-checkin/staff-checkin.component';
import { StaffCheckoutComponent } from './staff-checkout/staff-checkout.component';
import { StaffLoginGuard } from './staff-login.guard';
import { StaffLoginComponent } from './staff-login/staff-login.component';

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "", component: HomeComponent },
  { path: "booking-form/:hotel", component: BookingFormComponent },
  { path: "staff-login", component: StaffLoginComponent },
  { path: "staff-booking", component: StaffBookingComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-cancellation", component: StaffCancellationComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkin", component: StaffCheckinComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkout", component: StaffCheckoutComponent, canActivate: [StaffLoginGuard] },
  {path: 'map',component:MapComponent},
  {path: 'hotel-selection/:state',component:HotelSelectionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
