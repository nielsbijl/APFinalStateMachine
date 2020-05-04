package com.company;

import java.util.ArrayList;

public class Node {
    private final String id;
    private ArrayList<Transition> transition;

    // Contstructors
    public Node(String id, ArrayList<Transition> Transitions){
        this.id = id;
        this.transition = Transitions;
    }
    public void addTransition(Transition inputTransition){
        try {
            this.transition.add(inputTransition);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    // Get functions
    public String getId(){
        return this.id;
    }
    public ArrayList<Transition> getTransition(){
        return this.transition;
    }
}
