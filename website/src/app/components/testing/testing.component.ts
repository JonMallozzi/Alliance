import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-testing',
  templateUrl: './testing.component.html',
  styleUrls: ['./testing.component.less']
})
export class TestingComponent implements OnInit {

  @Input() msg = '';

  constructor() { }

  ngOnInit(): void {
  }

}
