package com.company;

public class Transmission {
    private final String read;
    private final Node start;
    private final Node end;
    public Transmission(String read, Node start, Node end){
        this.read = read;
        this.start = start;
        this.end = end;
    }
    public String getRead(){
        return this.read;
    }
    public Node getStart(){
        return this.start;
    }
    public Node getEnd(){
        return this.end;
    }
}
