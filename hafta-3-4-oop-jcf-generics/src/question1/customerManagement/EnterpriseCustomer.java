package question1.customerManagement;

import java.util.ArrayList;

import question1.accountManagement.Account;
import question1.insuranceManagement.Insurance;

public class EnterpriseCustomer extends Account{

	public EnterpriseCustomer(User user, ArrayList<Insurance> insuranceList) {
		super(user, insuranceList);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double addProfit(double insurancePrice) {
		double totalPrice;
		totalPrice = insurancePrice + (insurancePrice * 0.50);
		return totalPrice;
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
