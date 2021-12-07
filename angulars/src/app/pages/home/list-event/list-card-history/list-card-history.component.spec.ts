import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListCardHistoryComponent } from './list-card-history.component';

describe('ListCardHistoryComponent', () => {
  let component: ListCardHistoryComponent;
  let fixture: ComponentFixture<ListCardHistoryComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListCardHistoryComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListCardHistoryComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
