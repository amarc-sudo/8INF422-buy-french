import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivraisonConnectedComponent } from './livraison-connected.component';

describe('LivraisonConnectedComponent', () => {
  let component: LivraisonConnectedComponent;
  let fixture: ComponentFixture<LivraisonConnectedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LivraisonConnectedComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LivraisonConnectedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
