import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOne {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int secondInt;
        double secondDouble;
        String secondString;
        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        scan.nextLine();
        secondString = scan.nextLine();
        System.out.println(i+secondInt);
		System.out.println(d+secondDouble);
        System.out.print(s+secondString);
        scan.close();
    }
}