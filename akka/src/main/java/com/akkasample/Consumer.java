package com.akkasample;

import akka.actor.UntypedAbstractActor;

public class Consumer extends UntypedAbstractActor {
 
    @Override
    public void onReceive(Object msg) throws Exception {
        if(msg instanceof Integer) {
            System.out.println("<<< Receiving & printing " + msg);
        }
    }
}