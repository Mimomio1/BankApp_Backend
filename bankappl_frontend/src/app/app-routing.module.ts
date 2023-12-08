import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
// import { StaffComponent } from './admin/staff/staff.component';
// import { LoginComponent } from './staff/login/login.component';
// import { HomeComponent } from './customer/home/home.component';
// import { ForgotComponent } from './customer/forgot/forgot.component';
// import { DashboardComponent } from './customer/dashboard/dashboard.component';
// import { QuestionMismatchComponent } from './customer/question-mismatch/question-mismatch.component';
// import { UpdatePasswordComponent } from './customer/update-password/update-password.component';
// import { AccountnumComponent } from './staff/stffdashboard/accountnum/accountnum.component';
// import { ApproveaccountComponent } from './staff/stffdashboard/approveaccount/approveaccount.component';
// import { ApprovebfcyComponent } from './staff/stffdashboard/approvebfcy/approvebfcy.component';
// import { EnabletypecustomerComponent } from './staff/stffdashboard/enabletypecustomer/enabletypecustomer.component';
// import { StffdashboardComponent } from './staff/stffdashboard/stffdashboard.component';
// import { TransferComponent } from './staff/stffdashboard/transfer/transfer.component';
// import { ViewstaffComponent } from './admin/viewstaff/viewstaff.component';
// import { CreateacctComponent } from './customer/dashboard/createacct/createacct.component';
// import { RemovebeneficiaryComponent } from './customer/dashboard/removebeneficiary/removebeneficiary.component';
// import { TransfermoneyComponent } from './customer/dashboard/transfermoney/transfermoney.component';
// import { ViewstatementComponent } from './customer/dashboard/viewstatement/viewstatement.component';
// import { AddbeneficiaryComponent } from './customer/dashboard/addbeneficiary/addbeneficiary.component';

// import { RegisterComponent } from './customer/register/register.component';
// import { ProfileComponent } from './customer/dashboard/profile/profile.component';

const routes: Routes = [
  // { path: '', component: HomeComponent },
  // { path: 'admin/staff', component: StaffComponent },
  // { path: 'staff/login', component: LoginComponent },
  // { path: 'customer/home', component: HomeComponent },
  // { path: 'customer/register', component: RegisterComponent },
  // { path: 'customer/profile', component: ProfileComponent },
  // { path: 'customer/dashboard', component: DashboardComponent },
  // { path: 'customer/forgot', component: ForgotComponent },
  // { path: 'customer/question-mismatch', component: QuestionMismatchComponent },
  // { path: 'customer/update-password', component: UpdatePasswordComponent },
  // { path: 'stafflogin', component: LoginComponent },
  // { path: 'adminstaff', component: StaffComponent },
  // { path: 'staffdashboard', component: StffdashboardComponent },
  // { path: 'accountnum', component: AccountnumComponent },
  // { path: 'approvebfcy', component: ApprovebfcyComponent },
  // { path: 'enabletype', component: EnabletypecustomerComponent },
  // { path: 'transfer', component: TransferComponent },
  // { path: 'approveaccount', component: ApproveaccountComponent },
  // { path: 'adminstaff', component: StaffComponent },
  // { path: 'viewstaff', component: ViewstaffComponent },
  // { path: 'customer/createaccount', component: CreateacctComponent },
  // { path: 'customer/addbeneficiary', component: AddbeneficiaryComponent },
  // { path: 'customer/removebeneficiary', component: RemovebeneficiaryComponent },
  // { path: 'customer/transfermoney', component: TransfermoneyComponent },
  // { path: 'customer/viewstatement', component: ViewstatementComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
