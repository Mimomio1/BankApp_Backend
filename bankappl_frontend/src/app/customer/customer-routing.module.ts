import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginGuard } from '../core/landing/LoginGuard';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { AddBeneficiaryComponent } from './add-beneficiary/add-beneficiary.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ForgotPasswordComponent } from './forgot-password/forgot-password.component';
import { LoginComponent } from './login/login.component';
import { MismatchedComponent } from './mismatched/mismatched.component';

import { RegisterComponent } from './register/register.component';
import { RemoveBeneficiaryComponent } from './remove-beneficiary/remove-beneficiary.component';
import { TransferComponent } from './transfer/transfer.component';
import { UpdatePasswordComponent } from './update-password/update-password.component';

import { UpdateProfileComponent } from './update-profile/update-profile.component';

const routes: Routes = [
  {
    path: 'customer/login',
    component: LoginComponent,
  },
  {
    path: 'customer/register',
    component: RegisterComponent,
  },
  {
    path: 'customer/dashboard',
    component: DashboardComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'customer/profile',
    component: UpdateProfileComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'customer/accountDetails',
    component: AccountDetailsComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'customer/addBeneficiary',
    component: AddBeneficiaryComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'customer/createAccount',
    component: CreateAccountComponent,
  },
  {
    path: 'customer/forgotPassword',
    component: ForgotPasswordComponent,
  },
  {
    path: 'customer/removeBeneficiary',
    component: RemoveBeneficiaryComponent,
  },
  {
    path: 'customer/transfer',
    component: TransferComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'customer/updatePassword',
    component: UpdatePasswordComponent,
  },
  {
    path: 'customer/mismatched',
    component: MismatchedComponent,
  },
  {
    path: 'customer/dashboard',
    component: DashboardComponent,
    canActivate: [LoginGuard],
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class CustomerRoutingModule {}
