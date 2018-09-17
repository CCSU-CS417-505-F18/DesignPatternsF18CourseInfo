/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ccsu.genericexample;

/**
 *
 * @author cw1491
 */
public class Caretaker {
    public static void main(String[] args){
        try{
            Originator originator1 = new Originator("originator 1","transferInfo");
            System.out.println(originator1);
            Originator.Memento memento = originator1.createMemento();
            Originator originator2 = new Originator("originator 2","otherTransInfo");
            originator2.setMemento(memento);
            System.out.println(originator2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
