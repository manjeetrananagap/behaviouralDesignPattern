package com.training.nagarro.nagp.designpattern.behavioural.chainofresponsibility;

public class DispenserRupees2000 implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 2000) {
			int num = cur.getAmount() / 2000;
			int remainder = cur.getAmount() % 2000;
			System.out.println("Dispensing " + num + " 2000INR note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
