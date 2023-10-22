import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProduComponent } from './produ.component';

describe('ProduComponent', () => {
  let component: ProduComponent;
  let fixture: ComponentFixture<ProduComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProduComponent]
    });
    fixture = TestBed.createComponent(ProduComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
