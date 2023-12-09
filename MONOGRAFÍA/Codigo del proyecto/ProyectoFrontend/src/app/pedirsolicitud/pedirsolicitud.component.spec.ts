import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PedirsolicitudComponent } from './pedirsolicitud.component';

describe('PedirsolicitudComponent', () => {
  let component: PedirsolicitudComponent;
  let fixture: ComponentFixture<PedirsolicitudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PedirsolicitudComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PedirsolicitudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
