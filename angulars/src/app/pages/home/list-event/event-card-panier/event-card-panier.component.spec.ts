import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventCardPanierComponent } from './event-card-panier.component';

describe('EventCardPanierComponent', () => {
  let component: EventCardPanierComponent;
  let fixture: ComponentFixture<EventCardPanierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventCardPanierComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventCardPanierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
