package sk;
import java.util.Scanner;
public class flow1 {

	public static void main(String[] args) {
	
		int n;
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		System.out.println("enter the given number");
		if(n>0){
		System.out.println("the given number "+n+" is pasitive");}
		else if(n<0){
		System.out.println("the given number "+n+" is negative");
		}
				else {
		System.out.println("the given number "+n+" is zero");
		}
		
	}	
	

}
