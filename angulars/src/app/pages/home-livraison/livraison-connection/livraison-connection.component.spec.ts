import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LivraisonConnectionComponent } from './livraison-connection.component';

describe('LivraisonConnectionComponent', () => {
  let component: LivraisonConnectionComponent;
  let fixture: ComponentFixture<LivraisonConnectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LivraisonConnectionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LivraisonConnectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
