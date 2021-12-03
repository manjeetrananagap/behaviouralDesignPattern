package com.training.nagarro.nagp.designpattern.observer.test;

import com.training.nagarro.nagp.designpattern.observer.listener.impl.EmailNotificationListener;
import com.training.nagarro.nagp.designpattern.observer.listener.impl.LogOpenListener;
import com.training.nagarro.nagp.designpattern.observer.publisher.Editor;

public class Test {
	public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("D://logs//file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}