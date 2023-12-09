import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarcontratoComponent } from './registrarcontrato.component';

describe('RegistrarcontratoComponent', () => {
  let component: RegistrarcontratoComponent;
  let fixture: ComponentFixture<RegistrarcontratoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrarcontratoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarcontratoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
