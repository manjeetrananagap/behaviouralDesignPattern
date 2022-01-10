package com.training.nagarro.nagp.designpattern.observer.listener;
import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}