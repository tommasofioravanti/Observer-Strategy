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
public class StrategyB implements Strategy{
    private StrategyB(){};
    private static StrategyB ISTANCE=null;
    public static StrategyB getIstance(){
        if(ISTANCE==null)
            ISTANCE=new StrategyB();
        return ISTANCE;
    }
    
    @Override
    public void algorithm(){
        System.out.println("Sta eseguendo la strategia B...");
    }
    
    
}
