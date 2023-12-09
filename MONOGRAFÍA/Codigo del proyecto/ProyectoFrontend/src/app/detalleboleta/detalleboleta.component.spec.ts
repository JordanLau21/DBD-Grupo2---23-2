import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DetalleboletaComponent } from './detalleboleta.component';

describe('DetalleboletaComponent', () => {
  let component: DetalleboletaComponent;
  let fixture: ComponentFixture<DetalleboletaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DetalleboletaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DetalleboletaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
