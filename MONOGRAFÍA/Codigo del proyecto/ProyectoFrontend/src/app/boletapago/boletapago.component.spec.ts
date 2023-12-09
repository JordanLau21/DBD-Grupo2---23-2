import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BoletapagoComponent } from './boletapago.component';

describe('BoletapagoComponent', () => {
  let component: BoletapagoComponent;
  let fixture: ComponentFixture<BoletapagoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BoletapagoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BoletapagoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
