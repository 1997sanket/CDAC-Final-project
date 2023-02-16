import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { HomeComponent } from './home/home.component';
import { StaffLoginService } from './service/staff-login.service';
import { StaffBookingComponent } from './staff-booking/staff-booking.component';
import { StaffCancellationComponent } from './staff-cancellation/staff-cancellation.component';
import { StaffCheckinComponent } from './staff-checkin/staff-checkin.component';
import { StaffCheckoutComponent } from './staff-checkout/staff-checkout.component';
import { StaffLoginGuard } from './staff-login.guard';
import { StaffLoginComponent } from './staff-login/staff-login.component';

const routes: Routes = [
  { path: "home", component: HomeComponent },
  { path: "contactus", component: ContactUsComponent },
  { path: "", component: HomeComponent },

  { path: "staff-login", component: StaffLoginComponent },
  { path: "staff-booking", component: StaffBookingComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-cancellation", component: StaffCancellationComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkin", component: StaffCheckinComponent, canActivate: [StaffLoginGuard] },
  { path: "staff-checkout", component: StaffCheckoutComponent, canActivate: [StaffLoginGuard] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
