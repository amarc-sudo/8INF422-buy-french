import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventCardLivraisonComponent } from './event-card-livraison.component';

describe('EventCardLivraisonComponent', () => {
  let component: EventCardLivraisonComponent;
  let fixture: ComponentFixture<EventCardLivraisonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventCardLivraisonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventCardLivraisonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
