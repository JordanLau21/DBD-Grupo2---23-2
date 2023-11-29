import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VermovimientosComponent } from './vermovimientos.component';

describe('VermovimientosComponent', () => {
  let component: VermovimientosComponent;
  let fixture: ComponentFixture<VermovimientosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ VermovimientosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(VermovimientosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
