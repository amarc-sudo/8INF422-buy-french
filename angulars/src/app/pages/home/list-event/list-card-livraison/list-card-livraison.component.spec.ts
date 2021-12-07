import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCardLivraisonComponent } from './list-card-livraison.component';

describe('ListCardLivraisonComponent', () => {
  let component: ListCardLivraisonComponent;
  let fixture: ComponentFixture<ListCardLivraisonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListCardLivraisonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListCardLivraisonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
