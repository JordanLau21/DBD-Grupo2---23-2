import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NuevocargoComponent } from './nuevocargo.component';

describe('NuevocargoComponent', () => {
  let component: NuevocargoComponent;
  let fixture: ComponentFixture<NuevocargoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NuevocargoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NuevocargoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
