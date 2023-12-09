import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleplanillaComponent } from './detalleplanilla.component';

describe('DetalleplanillaComponent', () => {
  let component: DetalleplanillaComponent;
  let fixture: ComponentFixture<DetalleplanillaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleplanillaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetalleplanillaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
