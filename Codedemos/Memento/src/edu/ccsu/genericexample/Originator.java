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
public class Originator {
    private String transferrableInfo;
    private String valueNotInMemento;
    
    public Originator(String valueNotInMemento, String transferrableInfo){
        this.valueNotInMemento = valueNotInMemento;
        this.transferrableInfo = transferrableInfo;
    }
    
    public String toString(){
        return "Originator(transferrableInfo: "+transferrableInfo+"  valueNotInMemento: "+valueNotInMemento+")";
    }
    
    public Memento createMemento(){
        Memento memento = new Memento();
        memento.setTransferrableInfo(this.transferrableInfo);
        return memento;
    }
    
    public void setMemento(Memento memento){
        this.transferrableInfo = memento.getTransferrableInfo();
    }
    
    public static class Memento{
        private String transferrableInfo;
        private Memento(){
            
        }
        
        private void setTransferrableInfo(String transferrableInfo){
            this.transferrableInfo = transferrableInfo;
        }
        
        private String getTransferrableInfo(){
            return transferrableInfo;
        }
    }
}
