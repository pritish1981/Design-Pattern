package adapter.phonepay;

import adapter.phonepay.thirdparty.YesBankApi;

public class YesBankAdapter implements BankingService{
	
	private final YesBankApi yesBankApi = new YesBankApi();

	@Override
	public void addBankAccount(Bank bank) {
		System.out.printf("Calling yes bank api for registering bank account %s", bank.name);
        yesBankApi.registerBankAccount(bank.type, bank.name, bank.pan, bank.dob, bank.fname);
		
	}

	@Override
	public boolean pay(double amount, String account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
