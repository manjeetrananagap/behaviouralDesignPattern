package com.nagarro.nagp.deisgnpattern.template;

public class TemplateMethodPattern{
    public static void main(String args[]){
        System.out.println("--------------------");
    
        Game game = new Chess(new GameInfo());
        game.playGame();
        
       // game = new Ludo(new GameInfo());
        //game.playGame();
        
        //game = new Checkers(new GameInfo());
       // game.playGame();
    }
}