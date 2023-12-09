import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MovimientosplanillaComponent } from './movimientosplanilla.component';

describe('MovimientosplanillaComponent', () => {
  let component: MovimientosplanillaComponent;
  let fixture: ComponentFixture<MovimientosplanillaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MovimientosplanillaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MovimientosplanillaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
