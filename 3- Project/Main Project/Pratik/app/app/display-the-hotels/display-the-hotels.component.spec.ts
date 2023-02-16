import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayTheHotelsComponent } from './display-the-hotels.component';

describe('DisplayTheHotelsComponent', () => {
  let component: DisplayTheHotelsComponent;
  let fixture: ComponentFixture<DisplayTheHotelsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayTheHotelsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayTheHotelsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
