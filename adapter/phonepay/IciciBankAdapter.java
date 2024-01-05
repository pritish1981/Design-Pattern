package adapter.phonepay;

import adapter.phonepay.thirdparty.ICICIBankApi;

public class IciciBankAdapter implements BankingService{
	
	private final ICICIBankApi iciciBankApi;
	
	public IciciBankAdapter(ICICIBankApi iciciBankApi) {
		this.iciciBankApi = iciciBankApi;
	}

	@Override
	public void addBankAccount(Bank bank) {
		System.out.println("Registering a bank account");
        iciciBankApi.addBankAccount(bank.name, bank.aadhar, bank.pan);
		
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
