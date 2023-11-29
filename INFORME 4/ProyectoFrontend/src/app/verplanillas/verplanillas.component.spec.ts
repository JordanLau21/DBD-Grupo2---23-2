import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VerplanillasComponent } from './verplanillas.component';

describe('VerplanillasComponent', () => {
  let component: VerplanillasComponent;
  let fixture: ComponentFixture<VerplanillasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VerplanillasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VerplanillasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
