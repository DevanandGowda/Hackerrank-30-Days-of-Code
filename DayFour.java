import java.io.*;
import java.util.*;

public class DayFour {
    private int age;	
  
	public DayFour(int initialAge) {
  		
        if(initialAge>0)
            this.age = initialAge;
        else{
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
	}

	public void amIOld() {
        System.out.println((this.age<13)?"You are young.":((this.age>=13 && this.age<18)?"You are a teenager.":"You are old."));
	}

	public void yearPasses() {
  		
          this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			DayFour p = new DayFour(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}