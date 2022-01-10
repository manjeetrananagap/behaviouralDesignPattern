package com.nagarro.nagp.deisgnpattern.template;

class Checkers extends Game{
    public Checkers(GameInfo info){
        super(info);
    }
    public void createGame(){
        // Use GameInfo and create Game
        System.out.println("Creating Checkers game");
    }
    public void makeMoves(){
        System.out.println("Make Checkers moves");
    }
    public void applyRules(){
        System.out.println("Apply Checkers rules");
    }
    
}