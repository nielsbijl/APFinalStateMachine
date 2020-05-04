package com.company;

import java.util.ArrayList;

public class FSM {
    Node Start;
    public FSM(Node startNode){
        this.Start = startNode;
    }
    public ArrayList<String> f(ArrayList<String> ABstring){
        ArrayList<String> nodeLocations = new ArrayList<String>();
        nodeLocations.add(Start.getId());
        Node currentNode = Start;
        for (String character : ABstring) {
            Boolean error = true;
            for (Transition possibleTransition : (currentNode.getTransition())) {
                if ( possibleTransition.getRead() == character){
                    currentNode = possibleTransition.getEnd();
                    nodeLocations.add(currentNode.getId());
                    error = false;
                    break;
                }
            }
            if (error == true){
                System.out.println("There went something wrong with node: " + currentNode.getId());
                return null;
            }
        }
        return nodeLocations;
    }

}
