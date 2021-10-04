package com.example.restservice;

/**
 * Create a resource representation class {@link Greeting}
 */

public class Greeting {
    private final long iD;
    private final String content;

    public Greeting(long iD, String content){
        this.iD=iD;
        this.content=content;
    }

    public long getiD() {
        return iD;
    }
    public String getContent(){
        return content;
    }
}