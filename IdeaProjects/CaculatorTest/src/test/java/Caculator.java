import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by CE416-05 on 2014. 10. 24..
 */
public class Caculator {

        @Test
        public void testSum(){
            CalculatorTest c = new CalculatorTest();
            double result = c.sum(10, 10);
            assertEquals(20, result, 0);

        }

        public void testDiv(){

            CalculatorTest c = new CalculatorTest();
            double result1 = c.div(1,5);
            assertEquals(5, result1, 0);
        }

       public void testSub(){
           CalculatorTest c = new CalculatorTest();
           double result2 = c.sub(4,1);
           assertEquals(1, result2, 0);

       }





    }

