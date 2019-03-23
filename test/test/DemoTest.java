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
public class DemoTest {

    @Test
    public void hello() {
        Total tmp = new Total();
        tmp.setTotal(2, 7);
        assertEquals(9, tmp.getTotal());

    }
}
