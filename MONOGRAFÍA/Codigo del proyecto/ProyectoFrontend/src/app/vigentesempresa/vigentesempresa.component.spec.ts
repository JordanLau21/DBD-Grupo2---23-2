import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VigentesempresaComponent } from './vigentesempresa.component';

describe('VigentesempresaComponent', () => {
  let component: VigentesempresaComponent;
  let fixture: ComponentFixture<VigentesempresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VigentesempresaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VigentesempresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
