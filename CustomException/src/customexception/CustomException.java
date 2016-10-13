/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customexception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dasg
 */
public class CustomException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float result = 0.0f;
        CustomException t = new CustomException();
        try {
            t.test(0);
            System.out.println("Result=" + result);
        } catch (IlligalValueException e) {
            System.out.println("Exception occurred=" + e.getLocalizedMessage());
        }
    }

    public void test(int var) throws IlligalValueException {
        if (var < 1) {
            throw new IlligalValueException("This is not a correct Value");
        }
        List<Object> restrictions = new ArrayList<Object>();
        List<Object> rowrestrictions = new ArrayList<Object>();
        restrictions.add("1");
        restrictions.add(1.0);
        restrictions.add(new Integer(1));
        rowrestrictions.add("2");
        rowrestrictions.add(2.0);
        rowrestrictions.add(new Integer(2));
        restrictions.addAll(rowrestrictions);
        restrictions.add(var);
        System.out.println("GD");

    }
}
