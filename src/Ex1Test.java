
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

    /**
     * test to chak if its cover proparly int to number at any base
     */
    @Test
        void int2NumberTest() {
        String num = "100bA";
        if (Ex1.isNumber(num) == true) {
            int x = Ex1.number2Int(num);
            int b = 3;
            String str = Ex1.int2Number(x, b);
            assertEquals(str, "10201b3");
        }
      String num2 = "11b2";
        if (Ex1.isNumber(num2)==true){
            int x = Ex1.number2Int(num2);
            char y = 'A';
            int b = Ex1.valueOfChar(y);
            String str1 = Ex1.int2Number(x,b);
            assertEquals(str1,"3b10");
        }
    }

        @Test
        void maxIndexTest() {
            String[] arr={"3bA","50","1101b2","FbG"};
            assertEquals(  Ex1.maxIndex(arr),1);
            String[] wrong = {"2","2","2",};
            assertEquals(Ex1.maxIndex(wrong),0);
        }

    /**
     * need to add test to unusual sige  like @ and !
     * and ABCDEFG cant be ok in test if i dont have base
     */
        @Test
        void isNumberTest() {
            String[] ok = {"56", "10112","5b6","ABbG","01b2","1","99"};
            for (int i = 0; i < ok.length; i = i + 1) {
                boolean okNumber = Ex1.isNumber(ok[i]);
                assertTrue(okNumber);
            }
            String[] NotOk = {"1bb2","10G","A","a",""," ","-3b5","3b3","5b11","10b13","null","b2","0b1","123b","GbG","3 b4","53-12b9","5b5","65b4","ABCDEFG","@34b5","1234b11" ,
            "b2", "2b2", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2","1G3bG"};
            for (int i = 0; i < NotOk.length; i = i + 1) {
              boolean NotokNumber = Ex1.isNumber(NotOk[i]);
                assertFalse(NotokNumber);
            }

        }
    @Test
    void number2Int() {
            String num = "56";
            if(Ex1.isNumber(num)== true) {
                int x = Ex1.number2Int(num);
                assertEquals(x, 56);
            }
        String num1 = "10112";
        if(Ex1.isNumber(num1)== true) {
            int x = Ex1.number2Int(num1);
            assertEquals(x, 10112);}
            String num2 = "11011b2";
            if(Ex1.isNumber(num2)== true) {
                int x = Ex1.number2Int(num2);
                assertEquals(x, 27);}

         String num3 = "ABCD";
         if(Ex1.isNumber(num3)== true) {
         int x = Ex1.number2Int(num3);
         assertEquals(x, -1);}
         String num4 = "EbG";
         if(Ex1.isNumber(num4)== true) {
         int x = Ex1.number2Int(num4);
         assertEquals(x, 14);}
         String num5 = "123456b7";
         if(Ex1.isNumber(num5)== true) {
         int x = Ex1.number2Int(num5);
         assertEquals(x, 22875);}

    }
    @Test
    void valueOfCharTest() {
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

    @Test
    void testEquals() {
            String[] n1 = {"10110b2","156b7","1010b2"};
            String[] n2 = {"22","4152b7","22b4"};
            assertTrue(Ex1.equals(n1[0],n2[0]));
            assertFalse(Ex1.equals(n1[1],n2[1]));
            assertTrue(Ex1.equals(n1[2],n2[2]));
    }


    // Add additional test functions - test as much as you can.
    }
