package org.springframework.samples.petclinic.proxy;

public class CreditCard implements Payment{

	Payment cash = new Cash();

	@Override
	public void pay(int amount) {
		if (amount > 10000000) {
			System.out.println(amount + "원 카드결제");
		}else {
			cash.pay(amount);
		}
	}
}
