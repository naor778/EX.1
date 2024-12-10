/**  
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    /**
     * Convert the given number (num) to a decimal representation (as int).
     * It the given number is not in a valid format returns -1.
     * @param num a String representing a number in basis [2,16]
     * @return
     */
    public static int number2Int(String num) {
        int ans = -1;
        if (isNumber(num)==true){
        int ans1 = 0;
        int finel = 0;
        String result = "";
        char split = 'b';
        int ofSplit = num.indexOf(split);
        String Number = num.substring(0, ofSplit);
        String Base = num.substring(ofSplit + 1);
        for ( int i =0;i<Number.length();i=i+1) {
            char y = Number.charAt(i);
            int x = valueOfChar(y);
            char l = Base.charAt(0);
            int Bas = valueOfChar(l);
            result += "" + x;
            if (i == (Number.length() - 1)) {
                for (int j = 0; j < result.length(); j = j + 1) {
                    int c = ((result.length()) - (result.length()) + j);
                    char f = result.charAt(result.length() - (j + 1));
                    int d = valueOfChar(f);
                    ans1 = (int) (d * (Math.pow(Bas, c)));
                    finel += ans1;

                }
                return ans1;
            }
        }
        }
        return ans;
    }


    public static String[] SplitString (String a ){
        char b = 'b';
        int y = a.indexOf(b);
        String Number = a.substring(0,y);
        String Base = a.substring(y+1,a.length());
        return new String[] {Number,Base};
    }

    /**
     * This static function checks if the given String (g) is in a valid "number" format.
     * @param a a String representing a number
     * @return true iff the given String is in a number format
     */
    public static boolean isNumber (String a) {
        boolean ans = false;
        if (a == null || a.isEmpty() || a.charAt(0) == '-') {
            return ans;
        }
        char split = 'b';
        int ofSplit = a.indexOf(split);
        if (ofSplit == (-1)) {
            String Number = a;
            int base = 10;
            for (int i = 0; i < Number.length(); i = i + 1) {
                char p = Number.charAt(i);
                int Num = valueOfChar(p);
                if (Num >= 0 && Num <= 16) {
                    ans = true;
                }
            }
            return ans;
        } else {
            String Base = a.substring(ofSplit + 1);
            String Number = a.substring(0, ofSplit);
            if (Base.length() == 0||Base.length()>1) {
                ans = false;
                return ans;
            }
        }
        String Number = a.substring(0, ofSplit);
        String Base = a.substring(ofSplit + 1);
        if (Number.length() == 0) {
            ans = false;
            return ans;
        } else if(Number.length() != 0&&Base.length() != 0&&ofSplit != (-1)){
            for (int k = 0; k < Number.length(); k = k + 1) {
                char n = Number.charAt(k);
                int Num1 = valueOfChar(n);
                char m = Base.charAt(0);
                int Bas1 = valueOfChar(m);
                if (Num1 >= Bas1 ||Bas1<=1) {
                    ans = false;
                } else if (Number.length() != 0 && Base.length() != 0 && ofSplit != (-1)) {
                    if(Num1<Bas1 && Num1!=(-1)) {
                        ans=true;
                    }else {
                        ans =false;
                        return ans;}

                }
            }
        }
        return ans;
    }


            /**
             * Calculate the number representation (in basis base)
             * of the given natural number (represented as an integer).
             * If num<0 or base is not in [2,16] the function should return "" (the empty String).
             * @param num the natural number (include 0).
             * @param base the basis [2,16]
             * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
             */
            public static String int2Number ( int num, int base){
                String ans = "";
                // add your code here

                ////////////////////
                return ans;
            }

            /**
             * Checks if the two numbers have the same value.
             * @param n1 first number
             * @param n2 second number
             * @return true iff the two numbers have the same values.
             */
            public static boolean equals (String n1, String n2){
                boolean ans = true;
                // add your code here

                ////////////////////
                return ans;
            }

            /**
             * This static function search for the array index with the largest number (in value).
             * In case there are more than one maximum - returns the first index.
             * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
             * @param arr an array of numbers
             * @return the index in the array in with the largest number (in value).
             *
             */
            public static int maxIndex (String[]arr){
                int ans = 0;
                // add your code here

                ////////////////////
                return ans;
            }

            /**
             *  convert the char to int num   for exsample if i get char of '7' its bring back int = 7
             * and if i get char ='G'  its return int = 16;
             * @param y  = char that is 0-9 or A-G     char y = 'A';
             * @return int  y = 10 ;
             */
            public static int valueOfChar ( char y){
                int ans = -1;
                if (Character.isDigit(y)) {
                    ans = Character.getNumericValue(y);
                } else if (y == 'A') {
                    ans = 10;
                } else if (y == 'B') {
                    ans = 11;
                } else if (y == 'C') {
                    ans = 12;
                } else if (y == 'D') {
                    ans = 13;
                } else if (y == 'E') {
                    ans = 14;
                } else if (y == 'F') {
                    ans = 15;
                } else if (y == 'G') {
                    ans = 16;
                }

                return ans;
            }

        }


