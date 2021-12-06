import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivraisonHomeComponent } from './livraison-home.component';

describe('LivraisonHomeComponent', () => {
  let component: LivraisonHomeComponent;
  let fixture: ComponentFixture<LivraisonHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LivraisonHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LivraisonHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
