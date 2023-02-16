import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { LeftNavComponent } from './left-nav/left-nav.component';
import { RightNavComponent } from './right-nav/right-nav.component';
import { HomeComponent } from './home/home.component';
import { StaffLoginComponent } from './staff-login/staff-login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { StaffBookingComponent } from './staff-booking/staff-booking.component';
import { StaffCancellationComponent } from './staff-cancellation/staff-cancellation.component';
import { StaffCheckinComponent } from './staff-checkin/staff-checkin.component';
import { StaffCheckoutComponent } from './staff-checkout/staff-checkout.component';
import { ContactUsComponent } from './contact-us/contact-us.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    LeftNavComponent,
    RightNavComponent,
    HomeComponent,
    StaffLoginComponent,
    StaffBookingComponent,
    StaffCancellationComponent,
    StaffCheckinComponent,
    StaffCheckoutComponent,
    ContactUsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
