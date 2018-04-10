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
public class StrategyC implements Strategy{
    private StrategyC(){};
    private static StrategyC ISTANCE=null;
    public static StrategyC getIstance(){
        if(ISTANCE==null)
            ISTANCE=new StrategyC();
        return ISTANCE;
    }
    @Override
    public void algorithm(){
        System.out.println("Sta eseguendo la strategia C...");
    }
    
    
}
