/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojenkinsgit;

/**
 *
 * @author Hoang Pham
 */
public class DemoJenkinsGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Total tmp = new Total();
        tmp.setTotal(2, 7);
        System.out.println("2 + 7 = " + tmp.getTotal());
    }
}
