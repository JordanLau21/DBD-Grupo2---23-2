import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DesvinculadosempresaComponent } from './desvinculadosempresa.component';

describe('DesvinculadosempresaComponent', () => {
  let component: DesvinculadosempresaComponent;
  let fixture: ComponentFixture<DesvinculadosempresaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DesvinculadosempresaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DesvinculadosempresaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
