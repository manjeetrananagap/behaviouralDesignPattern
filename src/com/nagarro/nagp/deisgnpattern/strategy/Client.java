package com.nagarro.nagp.deisgnpattern.strategy;

public class Client { 

    public static void main(String[] args) { 
        //Default 
        Navigator navigation = new Navigator(); 
        navigation.execute(); 

        // When we choose the strategy to travel.
        navigation.setStrategy(new PedestrianStrategy()); 
        navigation.execute(); 
    } 

}