import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MiscontratosComponent } from './miscontratos.component';

describe('MiscontratosComponent', () => {
  let component: MiscontratosComponent;
  let fixture: ComponentFixture<MiscontratosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MiscontratosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MiscontratosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
