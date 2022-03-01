package Introduction;

import java.io.*;
import java.util.*;

public class JavaIfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result;
        int N = scan.nextInt();
        if(N%2 == 0) {
            if( (N >=2 && N <=5) || N > 20) {
                result = "Not Weird";
            } else {
                result = "Weird";
            }
        } else {
            result = "Weird";
        }
        System.out.println(result);
    }
}
