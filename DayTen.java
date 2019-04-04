import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DayTen {
    public static int soultion1(int n){
        int tmpCount = 0,maxCount = 0;
        char[] binString = Integer.toBinaryString(n).toCharArray();
        
        for(int i=0; i<binString.length;i++){
            if(binString[i]=='0'){
                if(tmpCount > maxCount){
                    maxCount = tmpCount;
                }
                tmpCount = 0;
            }
            else
                tmpCount = tmpCount + 1;
        }
        return (tmpCount>maxCount)?tmpCount:maxCount;
    }

    public static int soultion2(int n){
        int tmpCount = 0,maxCount = 0;
        char[] binString = Integer.toBinaryString(n).toCharArray();
        
        for(int i=0; i<binString.length;i++){
            tmpCount = (binString[i]=='0')?0:tmpCount+1;
            if(tmpCount > maxCount)
                maxCount = tmpCount;
        }
        return (tmpCount>maxCount)?tmpCount:maxCount;
    }

    public static int soultion3(int n){
        int maxCount = 0;
        String[] binStrings = Integer.toBinaryString(n).split("0");
        for(String s: binStrings)
            if(s.length()>maxCount)
                maxCount = s.length();
        return maxCount;
    }

    public static int soultion4(int n){
        int maxCount = 0;
        String[] binStrings = Integer.toBinaryString(n).split("0");
        Arrays.sort(binStrings);
        return binStrings[binStrings.length - 1].length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.print(soultion4(n));
        scanner.close();
    }
}
