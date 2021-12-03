package com.training.nagarro.nagp.designpattern.observer.example;

public class Test {
	
	public static void main(String[] args)
	{
	Channel exampleChannel = new Channel();
	
	Subscriber s1 = new Subscriber("Manjeet");
	Subscriber s2 = new Subscriber("Jitesh");
	Subscriber s3 = new Subscriber("Aarzoo");
	
	
	
	exampleChannel.subscribe(s1);
	exampleChannel.subscribe(s2);
	exampleChannel.subscribe(s3);
	
	s1.subscribeChannel(exampleChannel);
	s2.subscribeChannel(exampleChannel);
	s3.subscribeChannel(exampleChannel);
	
	exampleChannel.unSubscribe(s2);
	
	
	exampleChannel.upload("Explorig Design Pattern");
	
	}
	
}
