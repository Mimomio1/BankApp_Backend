import { Injectable } from '@angular/core';
import {
  CanActivate,
  ActivatedRouteSnapshot,
  Router,
  RouterStateSnapshot,
} from '@angular/router';
import { AuthService } from 'src/app/services/auth.service';

@Injectable()
export class LoginGuard implements CanActivate {
  constructor(private identityService: AuthService, private router: Router) {}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): boolean {
    if (this.identityService.isLoggedIn()) {
      // determine if the uder is logged in from this method.
      return true;
    }
    this.router.navigate(['/customer/login']);
    return false;
  }
}
