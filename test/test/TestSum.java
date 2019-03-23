/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import demojenkinsgit.Total;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hoang Pham
 */
public class TestSum {
    
    @Test
    public void checkSum(){
        Total tmp = new Total();
        System.out.println(tmp.getTotalSum(2, 3));
        assertEquals(5, tmp.getTotalSum(2, 3));
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
