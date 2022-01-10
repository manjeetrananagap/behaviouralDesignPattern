package com.nagarro.nagp.deisgnpattern.template;

class Chess extends Game{
    public Chess(GameInfo info){
        super(info);
    }
    public void createGame(){
        // Use GameInfo and create Game
        System.out.println("Creating Chess game");
    }
    public void makeMoves(){
        System.out.println("Make Chess moves");
    }
    public void applyRules(){
        System.out.println("Apply Chess rules");
    }
}