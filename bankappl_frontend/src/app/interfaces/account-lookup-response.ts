import { TransactionLookupResponse } from './transaction-lookup-response';

export interface AccountLookupResponse {
  accountNumber: number;
  fullname: string;
  balance: number;
  transactions: TransactionLookupResponse[];
}
