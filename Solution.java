import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2 == 1 || (n>=6 && n<=20))
        {
            System.out.println("Weird");
        }
        else
        System.out.println("Not Weird");
        
    }
}
