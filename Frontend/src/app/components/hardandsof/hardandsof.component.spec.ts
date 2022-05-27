import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardandsofComponent } from './hardandsof.component';

describe('HardandsofComponent', () => {
  let component: HardandsofComponent;
  let fixture: ComponentFixture<HardandsofComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardandsofComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HardandsofComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
