package exercise_1_QA.exercise_1_QA;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * students submitting :
 * Tomer Katz
 * Noam Keter
 */

public class AppTest {

	question4 tester = new question4();
   
    @Test
    public void Test_1() {
    	String Expected_result = "A";
    	int a = 28 , b = 24;
    	String mod = "regular";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    @Test
    public void Test_2() {
    	String Expected_result = "B";
    	int a = 1 , b = 10;
    	String mod = "regular";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    
    
    @Test
    public void Test_3() {
    	String Expected_result = "B";
    	int a = -50 , b = -45;
    	String mod = "regular";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    } 
    
    @Test
    public void Test_4() {
    	String Expected_result = "A";
    	int a = 10 , b = 11;
    	String mod = "opposite";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    
    @Test
    public void Test_5() {
    	String Expected_result = "B";
    	int a = 28 , b = 20;
    	String mod = "opposite";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    
    @Test
    public void Test_6() {
    	String Expected_result = "A";
    	int a = -62 , b = -21;
    	String mod = "opposite";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    @Test
    public void Test_7() {
    	String Expected_result = "A";
    	int a = 12 , b = 21;
    	String mod = "Reciprocal";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    @Test
    public void Test_8() {
    	String Expected_result = "B";
    	int a = 3 , b = 2;
    	String mod = "Reciprocal";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    }
    @Test
    public void Test_9() {
    	String Expected_result = "A";
    	int a = -9 , b = -5;
    	String mod = "Reciprocal";
    	String actual = tester.Compare(a, b,mod);
    	assertEquals(Expected_result, actual);
    } 
    
    
    
    
    
    
}
