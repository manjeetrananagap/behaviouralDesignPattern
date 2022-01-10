package com.nagarro.nagp.deisgnpattern.template;

class Ludo extends Game{
    public Ludo(GameInfo info){
        super(info);
    }
    public void createGame(){
        // Use GameInfo and create Game
        System.out.println("Creating Ludo game");
    }
    public void makeMoves(){
        System.out.println("Make Ludo moves");
    }
    public void applyRules(){
        System.out.println("Apply Ludo rules");
    }
}