import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SignInRequest } from 'src/app/models/sign-in-request';
import { AuthService } from 'src/app/services/auth.service';
import { StaffService } from 'src/app/services/staff.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  loginForm = new SignInRequest();
  message: string = '';
  errorMsg: string = '';

  constructor(
    private _router: Router,
    private _staffService: StaffService,
    private _authService: AuthService
  ) {}

  ngOnInit(): void {
    this._authService.logout();
  }

  login(): void {
    this._staffService.authStaff(this.loginForm).subscribe({
      next: (result) => {
        var roles = result.roles;
        if (roles.includes('ROLE_ADMIN')) {
          this._router.navigate(['/admin/dashboard']);
        } else if (roles.includes('ROLE_STAFF')) {
          this._router.navigate(['/staff/dashboard']);
        } else if (roles.includes('ROLE_CUSTOMER')) {
          this._router.navigate(['/customer/dashboard']);
        } else {
          this.errorMsg = 'Invalid role specified';
          this._authService.logout();
        }
      },
      error: (err) => {
        this.errorMsg = err.message;
      },
    });
  }
}
