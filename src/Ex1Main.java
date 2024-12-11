
import java.util.Arrays;
import java.util.Scanner;

/**
 * Intro2CS, Ex1 - very basic "main template"
 * Make sure your implementation of this main performs as the Ex1Sol.jar solution implement all needed functions.
 *
 */
public class Ex1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = "", num2 = "", quit = "quit";
        while (!num1.equals(quit) && !num2.equals(quit)) {
            System.out.println();
            System.out.println("Ex1 class solution:");
            System.out.println("Enter a string as number#1 (or \"quit\" to end the program): ");
            num1 = sc.next();
            if(num1.equals(quit)){break;}
            while (Ex1.isNumber(num1) != true) {
                if(Ex1.isNumber(num1)==true) {
                    System.out.println("num1=" + num1 + " is number:" + Ex1.isNumber(num1) + ",value:" + Ex1.number2Int(num1));
                    break;
                }else {
                    System.out.println("num1=" + num1 + " is number:" + Ex1.isNumber(num1) + ",value:" + Ex1.number2Int(num1));
                    System.out.println("ERR: num1 is in the wrong format!" + "(" + num1 + ")");
                }
                if (num1.equals(quit)) {
                    break;
                }

            }
            System.out.println("Enter a string as number#2 (or \"quit\" to end the program): ");
            num2 = sc.next();
            if (Ex1.isNumber(num2) == true && num2 != null && !num2.equals(quit)) {
                System.out.println("num2=" + num2 + " is number:" + Ex1.isNumber(num2) + ",value:" + Ex1.number2Int(num2));

            } else if (num2.equals(quit)) {
                break;
            } else {
                System.out.println("num2=" + num2 + " is number:" + Ex1.isNumber(num2) + ",value:" + Ex1.number2Int(num2));
                System.out.println("ERR: num2 is in the wrong format!" + "(" + num2 + ")");
            }
            while (true) {
                System.out.println("Enter a base for output: (a number [2,16])");
                int base = sc.nextInt();

                if (base >= 2 && base <= 16) {
                    int x = Ex1.number2Int(num1);
                    int y = Ex1.number2Int(num2);
                    int z = x + y;
                    int v = x * y;
                    System.out.println(num1 + "+" + num2 + "=" + Ex1.int2Number(z, base));
                    System.out.println(num1 + "*" + num2 + "=" + Ex1.int2Number(v, base));
                    String[] Maxindex = {num1,num2,Ex1.int2Number(z,base),Ex1.int2Number(v,base)};
                   int o = Ex1.maxIndex(Maxindex);
                   System.out.println("Max number over"+ Arrays.toString(Maxindex)+"is:"+ ""+Maxindex[o]);
                   break;
                } else {
                    System.out.println("Wrong base pls try once more");
                }
                if (num1.equals("quit")) {
                    break;
                }
            }
        }
        System.out.println("quiting now...");
    }
}
