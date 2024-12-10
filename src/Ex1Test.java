
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
           // implement this test
        }
        @Test
        void maxIndexTest() {
            // implement this test
        }

    /**
     * need to add test to unusual sige  like @ and !
     * and ABCDEFG cant be ok in test if i dont have base
     */
        @Test
        void isNumber() {
            String[] ok = {"10G", "56", "10112", "ABCDEFG","5b6"};
            for (int i = 0; i < ok.length; i = i + 1) {
                boolean okNumber = Ex1.isNumber(ok[i]);
                assertTrue(okNumber);
            }
            String[] NotOk = {""," ","-3b5","3b3","5b11","10b13","null","b2","0b1","123b","GbG","3 b4","53-12b9","5b5","65b4" };
            for (int i = 0; i < NotOk.length; i = i + 1) {
              boolean NotokNumber = Ex1.isNumber(NotOk[i]);
                assertFalse(NotokNumber);
            }

        }
     @Test
     void SplitString(){
            String[] ok ={"10G", "56", "10112", "ABCDEFG"};
            for (int i = 0; i<ok.length ; i=i+1){

         }
     }

    @Test
    void number2Int() {

    }

    @Test
    void int2Number() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void maxIndex() {
    }

    @Test
    void convertCharToNum() {
    }

    @Test
    void valueOfChar() {
            char d = 'b';
            char c = 'H';
            char y = '1';
            char x = 'A';
            char a = 'G';
            char b = '9';
            int y1 = 1;
            int x1 = 10;
            int a1 = 16;
            int b1 = 9;
            assertEquals(y1,Ex1.valueOfChar(y));
            assertEquals(x1,Ex1.valueOfChar(x));
            assertEquals(a1,Ex1.valueOfChar(a));
            assertEquals(b1, Ex1.valueOfChar(b));
            assertEquals(-1,Ex1.valueOfChar(c));
            assertEquals(-1,Ex1.valueOfChar(d));
    }


    // Add additional test functions - test as much as you can.
    }
