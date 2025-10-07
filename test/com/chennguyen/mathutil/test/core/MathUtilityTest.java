/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chennguyen.mathutil.test.core;

import com.chennguyen.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Lenovo
 */
public class MathUtilityTest {
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0;
        long exptexted = 1;
        
        long actual = MathUtil.getFactorial(n);
        
        //so sanh expected vs actual dung framework
        Assert.assertEquals(exptexted, actual);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_lambda(){
        Assert.assertThrows(IllegalArgumentException.class, 
                            () -> MathUtil.getFactorial(-5)); 
    }
}
