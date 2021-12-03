package com.training.nagarro.nagp.designpattern.behavioural.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}