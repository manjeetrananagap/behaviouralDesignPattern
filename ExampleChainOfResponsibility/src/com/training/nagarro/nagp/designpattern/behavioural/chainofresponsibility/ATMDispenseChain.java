package com.training.nagarro.nagp.designpattern.behavioural.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

	private DispenseChain c1;

	public ATMDispenseChain() {
		// initialize the chain
		this.c1 = new DispenserRupees2000();
		DispenseChain c2 = new DispenserRupees500();
		DispenseChain c3 = new DispenserRupees100();

		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();
		while (true) {
			int amount = 0;
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 100 != 0) {
				System.out.println("Amount should be in multiple of 100s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}
}
