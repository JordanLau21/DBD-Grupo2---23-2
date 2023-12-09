import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleboletaspagoComponent } from './detalleboletaspago.component';

describe('DetalleboletaspagoComponent', () => {
  let component: DetalleboletaspagoComponent;
  let fixture: ComponentFixture<DetalleboletaspagoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleboletaspagoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetalleboletaspagoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
