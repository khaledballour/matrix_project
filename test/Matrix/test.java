/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrix;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static matrix.Matrix.mul;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yahya
 */
public class test {
    
    public test() {
    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
private final PrintStream originalOut = System.out;
private final PrintStream originalErr = System.err;

@Before
public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
}

    @After
public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
    System.setOut(null);
}





//////////////////////////////////////////
////////// Test SmSumation //////////////
////////////////////////////////////////
    
    @Test
    public void testSumation_2x2(){
        int [][] array1={
            {1,2},
            {3,4}
        };
        int [][] array2={
            {1,1},
            {1,1}
        }; 
String out=
        "2     3     "+ System.getProperty("line.separator")+
        "4     5     "+ System.getProperty("line.separator");
        matrix.Matrix.sum(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
   
    @Test
    public void testSumation_3x2(){
        int [][] array1={
            {1,2,3},
            {3,4,5}
        };
        int [][] array2={{1,1,2},
            {1,1,3}
        }; 
String out=
        "2     3     5     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator");
        matrix.Matrix.sum(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
        @Test
    public void testSumation_3x3(){
        int [][] array1={
            {1,2,3},
            {3,4,5},
            {3,4,5}
        };
        int [][] array2={
            {1,1,2},
            {1,1,3},
            {1,1,3}
        }; 
String out=
        "2     3     5     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator");
        matrix.Matrix.sum(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void testSumation_3x4(){
        int [][] array1=
        {
            {1,2,3},
            {3,4,5},
            {3,4,5},
            {3,4,5}
        };
        int [][] array2=
        {
            {1,1,2},
            {1,1,3},
            {1,1,3},
            {1,1,3}
        }; 
String out=
        "2     3     5     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator")+
        "4     5     8     "+ System.getProperty("line.separator");
        matrix.Matrix.sum(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    
    
//////////////////////////////////////////
////////// Test Multiplication //////////
////////////////////////////////////////
    
    
    @Test
    public void testMultiplication_2x2(){
        int [][] array1=
        {
            {1,5},
            {2,6}
        };
        int [][] array2=
        {
            {1,0},
            {0,1}
        }; 
String out=
        "1     5     "+ System.getProperty("line.separator")+
        "2     6     "+ System.getProperty("line.separator");
        mul(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void testMultiplication_3x2_2x3(){
        int [][] array1=
        {
            {1,5},
            {2,6},
            {5,4}
        };
        int [][] array2=
        {
            {2,3,5},
            {4,2,6}
        }; 
String out=
        "22    13    35    "+ System.getProperty("line.separator")+
        "28    18    46    "+ System.getProperty("line.separator")+
        "26    23    49    "+ System.getProperty("line.separator");
        mul(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void testMultiplication_2x3_3x2(){
        int [][] array1=
        {
            {2,3,5},
            {4,2,6}

        };
        int [][] array2=
        {
            {1,5},
            {2,6},
            {5,4}
        }; 
String out=
        "33    48    "+ System.getProperty("line.separator")+
        "38    56    "+ System.getProperty("line.separator");

        mul(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    
//////////////////////////////////////////
////////// Test Subtraction /////////////
////////////////////////////////////////    
    
    
    @Test
    public void testSubtraction_2x2(){
        int [][] array1=
        {
            {4,4},
            {3,4},

        };
        int [][] array2=
        {
            {2,2},
            {1,1},

        }; 
String out=
        "2     2     "+ System.getProperty("line.separator")+
        "2     3     "+ System.getProperty("line.separator");

        matrix.Matrix.subt(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
        @Test
    public void testSubtraction_3x3(){
        int [][] array1=
        {
            {4,4,4},
            {3,2,5},
            {3,4,6}
        };
        int [][] array2=
        {
            {2,1,3},
            {1,1,2},
            {2,3,5}

        }; 
String out=
        "2     3     1     "+ System.getProperty("line.separator")+
        "2     1     3     "+ System.getProperty("line.separator")+
        "1     1     1     "+ System.getProperty("line.separator");

        matrix.Matrix.subt(array1, array2);
        
    assertEquals(out, outContent.toString());
    }

        @Test
    public void testSubtraction_2x3(){
        int [][] array1=
        {
            {4,4,4},
            {3,2,5}

        };
        int [][] array2=
        {
            {2,1,3},
            {1,1,2}


        }; 
String out=
        "2     3     1     "+ System.getProperty("line.separator")+
        "2     1     3     "+ System.getProperty("line.separator");


        matrix.Matrix.subt(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void testSubtraction_3x2(){
        int [][] array1=
        {
            {4,4},
            {3,2},
            {3,2}

        };
        int [][] array2=
        {
            {2,1},
            {1,1},
            {3,2}


        }; 
String out=
        "2     3     "+ System.getProperty("line.separator")+
        "2     1     "+ System.getProperty("line.separator")+
        "0     0     "+ System.getProperty("line.separator");


        matrix.Matrix.subt(array1, array2);
        
    assertEquals(out, outContent.toString());
    }
    
    
//////////////////////////////////////////
////////// Test Transpose ///////////////
////////////////////////////////////////
    @Test
    public void Transpose_3x1(){
        int [][] array1=
        {
            {4},
            {3},
            {3}

        };
 
String out=
        "4     3     3     "+ System.getProperty("line.separator");
        



        matrix.Matrix.transpose(array1);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void Transpose_1x3(){
        int [][] array1=
        {
            {1,2,3},
            

        };
 
String out=
        "1     "+ System.getProperty("line.separator")+
        "2     "+ System.getProperty("line.separator")+
        "3     "+ System.getProperty("line.separator");
        



        matrix.Matrix.transpose(array1);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void Transpose_3x2(){
        int [][] array1=
        {
            {1,2},
            {1,2},
            {1,2}
            

        };
 
String out=
        "1     1     1     "+ System.getProperty("line.separator")+
        "2     2     2     "+ System.getProperty("line.separator");
        



        matrix.Matrix.transpose(array1);
        
    assertEquals(out, outContent.toString());
    }
    @Test
    public void Transpose_4x2(){
        int [][] array1=
        {
            {5,4},
            {5,4},
            {5,4},
            {5,4}
            

        };
 
String out=
        "5     5     5     5     "+ System.getProperty("line.separator")+
        "4     4     4     4     "+ System.getProperty("line.separator");
        



        matrix.Matrix.transpose(array1);
        
    assertEquals(out, outContent.toString());
    }


    
//////////////////////////////////////////
////////// Test determination ///////////
////////////////////////////////////////
    
    @Test
    public void Det_2x2(){
        int [][] array1=
        {
            {1,2},
            {1,3}
        }; 
     int out=1;     
     assertEquals(out,matrix.Matrix.det(array1));
     }
    @Test
    public void Det_3x3(){
        int [][] array1=
        {
            {2,2,3},
            {4,3,3},
            {5,3,4}
        }; 
     int out=-5;     
     assertEquals(out,matrix.Matrix.det(array1));
     }
    
    
}


