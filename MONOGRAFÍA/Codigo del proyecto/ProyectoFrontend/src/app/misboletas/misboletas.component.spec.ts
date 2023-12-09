import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MisboletasComponent } from './misboletas.component';

describe('MisboletasComponent', () => {
  let component: MisboletasComponent;
  let fixture: ComponentFixture<MisboletasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MisboletasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MisboletasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
