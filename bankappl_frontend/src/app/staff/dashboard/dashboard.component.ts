import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'staff-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css'],
})
export class DashboardComponent implements OnInit {
  constructor() {}
  staffId: number = 0;

  ngOnInit(): void {}
}
