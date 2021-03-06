package com.training.nagarro.nagp.designpattern.behavioural.chainofresponsibility;

public class DispenserRupees500 implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		
		if (cur.getAmount() >= 500) {
			System.out.println("Inside Dispense 500.");
			int num = cur.getAmount() / 500;
			int remainder = cur.getAmount() % 500;
			System.out.println("Dispensing " + num + " 500INR note");
			if (remainder != 0)
				this.chain.dispense(new Currency(remainder));
		} else {
			this.chain.dispense(cur);
		}
	}

}
