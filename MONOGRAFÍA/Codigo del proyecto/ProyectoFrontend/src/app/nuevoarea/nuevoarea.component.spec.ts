import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevoareaComponent } from './nuevoarea.component';

describe('NuevoareaComponent', () => {
  let component: NuevoareaComponent;
  let fixture: ComponentFixture<NuevoareaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NuevoareaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NuevoareaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
