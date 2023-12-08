export interface CustomerResponse {
  id: number;
  username: string;
  fullname: string;

  secretQuestion: string;
  secretAnswer: string;

  phone: string;

  pan: string;
  aadhar: string;
}
