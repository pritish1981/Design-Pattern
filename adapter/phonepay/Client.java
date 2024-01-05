/**
 * 
 */
package adapter.phonepay;

import adapter.phonepay.thirdparty.ICICIBankApi;

public class Client {

	public static void main(String[] args) {
		YesBankAdapter yesBankAdapter = new YesBankAdapter();
		IciciBankAdapter iciciBankAdapter = new IciciBankAdapter(new ICICIBankApi());

		PhonePe phonePe = new PhonePe(iciciBankAdapter);
		phonePe.createBankAccount();

	}

}
