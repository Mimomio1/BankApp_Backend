import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginGuard } from '../core/landing/LoginGuard';
import { RegisterStaffComponent } from './register-staff/register-staff.component';
import { ViewStaffComponent } from './view-staff/view-staff.component';

const routes: Routes = [
  {
    path: 'admin/registerStaff',
    component: RegisterStaffComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'admin/dashboard',
    component: ViewStaffComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'admin/viewStaff',
    component: ViewStaffComponent,
    canActivate: [LoginGuard],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
