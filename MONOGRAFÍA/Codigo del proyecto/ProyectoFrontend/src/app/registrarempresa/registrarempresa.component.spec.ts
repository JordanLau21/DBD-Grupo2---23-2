import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistrarempresaComponent } from './registrarempresa.component';

describe('RegistrarempresaComponent', () => {
  let component: RegistrarempresaComponent;
  let fixture: ComponentFixture<RegistrarempresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegistrarempresaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RegistrarempresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
