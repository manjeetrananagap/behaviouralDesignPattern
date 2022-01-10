package com.nagarro.nagp.deisgnpattern.strategy;

public class Navigator {
	
	 //prescribed standard value (default behavior): ConcreteStrategyA
    private Strategy strategy = new Car(); 
    
    public void execute() { 
        //delegates the behavior to a Strategy object
        strategy.executeAlgorithm(); 
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Strategy getStrategy() { 
        return strategy; 
    } 

}
