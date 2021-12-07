import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ListCardPanierComponent } from './list-card-panier.component';

describe('ListCardPanierComponent', () => {
  let component: ListCardPanierComponent;
  let fixture: ComponentFixture<ListCardPanierComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListCardPanierComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListCardPanierComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
