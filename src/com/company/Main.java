package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Transmission> transmissions0 = new ArrayList<>();
        ArrayList<Transmission> transmissions1 = new ArrayList<>();
        ArrayList<Transmission> transmission2 = new ArrayList<>();
        ArrayList<Transmission> transmissions3 = new ArrayList<>();

	    // Create Nodes
        Node s0 = new Node("s0", transmissions0);
        Node s1 = new Node("s1",transmissions1);
        Node s2 = new Node("s2", transmission2);
        Node s3 = new Node("s3", transmissions3);

        // Create Transmissions
        Transmission s0s1 = new Transmission("B", s0, s1);
        Transmission s0s2 = new Transmission("A", s0, s2);
        Transmission s1s2 = new Transmission("B", s1, s2);
        Transmission s2s3 = new Transmission("B", s2, s3);
        Transmission s3s0 = new Transmission("B", s3, s0);
        Transmission s1s1 = new Transmission("A", s1, s1);
        Transmission s3s3 = new Transmission("A", s3, s3);

        // Add transmissions to nodes
        s0.addTransmission(s0s1);
        s0.addTransmission(s0s2);
        s1.addTransmission(s1s1);
        s1.addTransmission(s1s2);
        s2.addTransmission(s2s3);
        s3.addTransmission(s3s3);
        s3.addTransmission(s3s0);

        // Create the Final State Machine
        FSM finalStateMachine = new FSM(s0);
        ArrayList<String> input = new ArrayList<>();
        input.add("A");
        input.add("A");
        input.add("B");
        System.out.println(finalStateMachine.f(input));
    }
}
