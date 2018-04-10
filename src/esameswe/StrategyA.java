/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esameswe;

/**
 *
 * @author tommaso
 */
public class StrategyA implements Strategy{
    private StrategyA(){};
    private static StrategyA ISTANCE=null;
    public static StrategyA getIstance(){
        if(ISTANCE==null)
            ISTANCE=new StrategyA();
        return ISTANCE;
    }
    @Override
    public void algorithm(){
        System.out.println("Sta eseguendo la strategia A...");
    }
    
    
    
    
}
