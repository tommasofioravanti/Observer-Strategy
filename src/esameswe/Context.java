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
public class Context implements Observer{
    private int contextState;
    private Strategy s;
    
    public Context(Strategy s){
        this.s=s;
        
    }
    @Override
    public void update(Observable o){
        contextState=o.getState();
        switchStrategy(contextState);
        
    }
    public void switchStrategy(int state){
        if (state==0)
            s= StrategyA.getIstance();
        else if (state==1)
            s= StrategyB.getIstance();
        else
            s= StrategyC.getIstance();
    }
    public void contextInterface(){
        s.algorithm();
    }
    
    
}
