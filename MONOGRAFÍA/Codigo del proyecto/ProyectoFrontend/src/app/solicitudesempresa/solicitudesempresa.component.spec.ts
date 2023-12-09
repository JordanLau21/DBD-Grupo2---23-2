import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SolicitudesempresaComponent } from './solicitudesempresa.component';

describe('SolicitudesempresaComponent', () => {
  let component: SolicitudesempresaComponent;
  let fixture: ComponentFixture<SolicitudesempresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SolicitudesempresaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SolicitudesempresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
