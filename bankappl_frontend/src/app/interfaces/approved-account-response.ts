import { AccountType } from '../enums/account-type';

export interface ApprovedAccountResponse {
  accountType: AccountType;
  fullname: string;
  accountNumber: number;
  dateCreated: string;
  approved: string;
  staffUserName: string;
}
