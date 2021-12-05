import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventCardLiteComponent } from './event-card-lite.component';

describe('EventCardLiteComponent', () => {
  let component: EventCardLiteComponent;
  let fixture: ComponentFixture<EventCardLiteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventCardLiteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventCardLiteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
