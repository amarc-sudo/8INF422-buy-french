import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivraisonHomeDisconnectedComponent } from './livraison-home-disconnected.component';

describe('LivraisonHomeDisconnectedComponent', () => {
  let component: LivraisonHomeDisconnectedComponent;
  let fixture: ComponentFixture<LivraisonHomeDisconnectedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LivraisonHomeDisconnectedComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LivraisonHomeDisconnectedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
