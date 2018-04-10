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
public class EsameSWE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monitor m=new Monitor(0);
        Strategy sA = StrategyA.getIstance();
        Context c=new Context(sA);
        m.attach(c);
        c.contextInterface();
        m.setState(1);
        c.contextInterface();
        m.setState(4);
        c.contextInterface();
    }
    
}
