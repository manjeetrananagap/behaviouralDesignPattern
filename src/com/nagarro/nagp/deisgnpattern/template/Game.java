package com.nagarro.nagp.deisgnpattern.template;

public abstract class Game {
	    
	    protected GameInfo info;
	    
	    public Game(GameInfo info){
	        this.info = info;
	    }
	    public abstract void createGame();
	    public abstract void makeMoves();
	    public abstract void applyRules();
	    
	    /* playGame is template method. This algorithm skeleton can't be changed by sub-classes. sub-class can change
	       the behaviour only of steps like createGame() etc. */
	       
	    public void playGame(){
	    	
	        createGame();
	        makeMoves();
	        applyRules();
	        closeGame();
	    }
	    protected void closeGame(){
	        System.out.println("Close game:"+this.getClass().getName());
	        System.out.println("--------------------");
	    }
	}