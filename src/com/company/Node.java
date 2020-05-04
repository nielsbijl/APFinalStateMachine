package com.company;

import java.util.ArrayList;

public class Node {
    private final String id;
    private ArrayList<Transmission> transmissions;

    // Contstructors
    public Node(String id, ArrayList<Transmission> transmissions){
        this.id = id;
        this.transmissions = transmissions;
    }
    public void addTransmission(Transmission inputTransmission){
        try {
            this.transmissions.add(inputTransmission);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    // Get functions
    public String getId(){
        return this.id;
    }
    public ArrayList<Transmission> getTransmissions(){
        return this.transmissions;
    }
}
