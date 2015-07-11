import java.util.Scanner;


public class Enterthevalueprogram {
public static void main(String[]args) {
	
	Scanner scn =new Scanner(System.in);
	System.out.println("Enter a number");
	
	int num = scn.nextInt();
	scn.close();
	
	int i = 1;
	while (i <= 10) {
		System.out.println (num + "x" + i + "=" + num*i);
		i++;
	
	
	
}
}
}
