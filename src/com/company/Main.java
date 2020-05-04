package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<Transition> transition0 = new ArrayList<>();
        ArrayList<Transition> transition1 = new ArrayList<>();
        ArrayList<Transition> transition2 = new ArrayList<>();
        ArrayList<Transition> transition3 = new ArrayList<>();

	    // Create Nodes
        Node s0 = new Node("s0", transition0);
        Node s1 = new Node("s1", transition1);
        Node s2 = new Node("s2", transition2);
        Node s3 = new Node("s3", transition3);

        // Create Transmissions
        Transition s0s1 = new Transition("B", s0, s1);
        Transition s0s2 = new Transition("A", s0, s2);
        Transition s1s2 = new Transition("B", s1, s2);
        Transition s2s3 = new Transition("B", s2, s3);
        Transition s3s0 = new Transition("B", s3, s0);
        Transition s1s1 = new Transition("A", s1, s1);
        Transition s3s3 = new Transition("A", s3, s3);

        // Add transmissions to nodes
        s0.addTransition(s0s1);
        s0.addTransition(s0s2);
        s1.addTransition(s1s1);
        s1.addTransition(s1s2);
        s2.addTransition(s2s3);
        s3.addTransition(s3s3);
        s3.addTransition(s3s0);

        // Create the Final State Machine
        FSM finalStateMachine = new FSM(s0);
        ArrayList<String> input = new ArrayList<>();

        // Test error
        input.add("A");
        input.add("A");
        input.add("B");
        System.out.println(finalStateMachine.f(input));

        // Test happy flow
        input.clear();
        input.add("B");
        input.add("A");
        input.add("B");
        input.add("B");
        input.add("A");
        input.add("B");
        System.out.println(finalStateMachine.f(input));
    }
}
