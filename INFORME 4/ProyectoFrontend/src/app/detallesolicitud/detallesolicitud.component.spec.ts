import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetallesolicitudComponent } from './detallesolicitud.component';

describe('DetallesolicitudComponent', () => {
  let component: DetallesolicitudComponent;
  let fixture: ComponentFixture<DetallesolicitudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetallesolicitudComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetallesolicitudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
