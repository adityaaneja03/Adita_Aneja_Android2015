
public class ifelsenested {
public static void main(String args[]) {

 int test1 =1, test2 = 2;
 if (test1 == 5 && test2 == 3) {
 System.out.println("Hi, test 1 is 5 and test 2 is 3");
 }  else if ((test1 == 5) && (test2 !=3)) {
	 System.out.println("Hi test 1 is 5 and test 2 is some value other than 3"); 
 }	 else if (test1 == 4) {
	System.out.println("Hi, test 1 is equal to 4");
}  else if (test1 == 3 && test2 ==3) {
	System.out.println ("Hi, test1 is 3 and test2 is 3"); 
} else if (test1 == 3 && test2 == 2) {
	System.out.println ("Hi, test1 is 3 and test2 is 2");
} else if (test1 != 3 && test1 !=4 && test1 !=5) {
		System.out.println("Hi, test1 is not 3, 4 or 5");
	}
}
}
 