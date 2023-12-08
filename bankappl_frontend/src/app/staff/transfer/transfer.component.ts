import { Component, OnInit } from '@angular/core';
import { StaffService } from 'src/app/services/staff.service';
import { TransferAmountRequest } from 'src/app/models/transfer-amount-request';
import { TokenStorageService } from 'src/app/services/token-storage.service';

@Component({
  selector: 'app-transfer',
  templateUrl: './transfer.component.html',
  styleUrls: ['./transfer.component.css'],
})
export class TransferComponent implements OnInit {
  amount: any;
  fromAccNumber: any;
  toAccNumber: any;
  reason: any;

  constructor(
    private _staffService: StaffService,
    private _tokenStorageService: TokenStorageService
  ) {}

  ngOnInit(): void {}

  initiateTransfer(): void {
    if (this.fromAccNumber && this.toAccNumber && this.amount) {
      if (this.amount <= 0) {
        alert('Amount cannot be zero or less');
      } else if (this.fromAccNumber === this.toAccNumber) {
        alert('You cannot transfer funds to the same account.');
      } else {
        const request = new TransferAmountRequest();
        const token = this._tokenStorageService.getTokenResponse();
        if (token === null) {
          console.log('Unable to verify staff member.');
        } else {
          request.amount = this.amount;
          request.byStaff = token.username;
          request.fromAccNumber = this.fromAccNumber;
          request.reason = this.reason;
          request.toAccNumber = this.toAccNumber;
          this._staffService.doTransfer(request).subscribe({
            next: (result) => {
              alert('Transfer Successful');
            },
            error: (err) => {
              alert(err.message);
            },
          });
        }
      }
    } else {
      console.log(this.amount);
      console.log(this.fromAccNumber);
      console.log(this.reason);
      console.log(this.toAccNumber);
      alert('Invalid request');
    }
  }
}
