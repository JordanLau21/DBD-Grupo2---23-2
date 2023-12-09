import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InicioempleadoComponent } from './inicioempleado.component';

describe('InicioempleadoComponent', () => {
  let component: InicioempleadoComponent;
  let fixture: ComponentFixture<InicioempleadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InicioempleadoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(InicioempleadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
