import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { FindTheHotelComponent } from './find-the-hotel/find-the-hotel.component';
import { BookingFormComponent } from './booking-form/booking-form.component';
import { HomeComponent } from './home/home.component';
import { StaffLoginService } from './service/staff-login.service';
import { StaffBookingComponent } from './staff-booking/staff-booking.component';
import { StaffCancellationComponent } from './staff-cancellation/staff-cancellation.component';
import { StaffCheckinComponent } from './staff-checkin/staff-checkin.component';
import { StaffCheckoutComponent } from './staff-checkout/staff-checkout.component';
import { StaffLoginGuard } from './staff-login.guard';
import { StaffLoginComponent } from './staff-login/staff-login.component';
import { DisplayTheHotelsComponent } from './display-the-hotels/display-the-hotels.component';

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "", component: HomeComponent },
  { path: "staff-login", component: StaffLoginComponent },
  //{ path: "booking-form", component: BookingFormComponent },
  { path: "find-the-hotel", component: FindTheHotelComponent },
  { path: "staff-booking", component: StaffBookingComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-cancellation", component: StaffCancellationComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkin", component: StaffCheckinComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkout", component: StaffCheckoutComponent, canActivate: [StaffLoginGuard] },
  { path: "getHotelByPinCode/:pin",component: DisplayTheHotelsComponent },
  { path: "booking-form/:hotel", component: BookingFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
