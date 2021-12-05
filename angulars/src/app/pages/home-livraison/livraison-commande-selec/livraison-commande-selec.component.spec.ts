import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivraisonCommandeSelecComponent } from './livraison-commande-selec.component';

describe('LivraisonCommandeSelecComponent', () => {
  let component: LivraisonCommandeSelecComponent;
  let fixture: ComponentFixture<LivraisonCommandeSelecComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LivraisonCommandeSelecComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LivraisonCommandeSelecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
