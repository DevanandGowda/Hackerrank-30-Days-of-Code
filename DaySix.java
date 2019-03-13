import java.io.*;
import java.util.*;

public class DaySix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        StringBuilder oddStrings = new StringBuilder();
        StringBuilder evenStrings = new StringBuilder(); 
        String strings;
        char[] chars;
        scan.nextLine();
        for(int i=0; i<num; i++){
            strings = scan.nextLine();
            chars =  strings.toCharArray();
            for(int j=0; j<strings.length(); j++){
                if(j%2==0){
                    evenStrings.append(chars[j]);
                }
                else{
                    oddStrings.append(chars[j]);
                }  
            }
            System.out.println(evenStrings.toString()+" "+oddStrings.toString());
            evenStrings.setLength(0);
            oddStrings.setLength(0);
            oddStrings = new StringBuilder();
            evenStrings = new StringBuilder(); 
        }
    }
}

