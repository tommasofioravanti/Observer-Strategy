/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esameswe;
//import java.util.Observable;
/**
 *
 * @author tommaso
 */
public class Monitor extends Observable{
    private int monitorState;
    
    public Monitor(int state){
        monitorState=state;
    }
    public void setState(int state){
        monitorState=state;
        Notify();
      
    }
    public int getState(){
        return monitorState;
    }
    
}
