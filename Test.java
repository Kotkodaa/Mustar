/*
 * File: Test.java
 * Author: Kondor Marcell
 * Copyright: 2023 Kondor Marcell
 * Group: Szoftverfejlesztő 1/1
 * Date: 2023.05.11
 * Github:
 */
import static org.junit.Assert.assertEquals;

public class Test{
    

    @org.junit.Test
    void testVolumeCalculation() {
        double a = 2.5;
        double b = 3.0;
        double c = 4.5;
        double expected = a * b * c;
        double actual = Control.szamitas(a, b, c);
        assertEquals(expected, actual ,Control.szamitas(2.5, 3.0, 4.5));
    
    }
}
