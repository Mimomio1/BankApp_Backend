import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginGuard } from '../core/landing/LoginGuard';
import { ApproveAccountComponent } from './approve-account/approve-account.component';
import { ApproveBeneficiaryComponent } from './approve-beneficiary/approve-beneficiary.component';
import { CustomerAccountsComponent } from './customer-accounts/customer-accounts.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EnableDisableCustomerComponent } from './enable-disable-customer/enable-disable-customer.component';
import { LoginComponent } from './login/login.component';
import { TransferComponent } from './transfer/transfer.component';

const routes: Routes = [
  {
    path: 'staff/login',
    component: LoginComponent,
  },
  {
    path: 'staff/approve-account',
    component: ApproveAccountComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'staff/approve-beneficiary',
    component: ApproveBeneficiaryComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'staff/customer-accounts',
    component: CustomerAccountsComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'staff/dashboard',
    component: DashboardComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'staff/enable-disable-customer',
    component: EnableDisableCustomerComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'staff/transfer',
    component: TransferComponent,
    canActivate: [LoginGuard],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class StaffRoutingModule {}
