import java.io.*;
import java.util.Scanner;

public class MajorOutput01
{
	public static void main(String []args){
			int x;
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number any number you want to check if even or odd?: ");
			x = input.nextInt();

		if(x % 2 == 0)
       	 {
      	      System.out.println(""+x+" is Even ");
       	 }
       	 else
       	 {
            System.out.println(""+x+" is Odd ");
		}
	}
}
