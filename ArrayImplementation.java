import java.util.Scanner;

	public class ArrayImplementation {
	public static void main (String [] args) {

//Creating an integer array with 5 elements
	int[] num = new int[5];

//Assigning values to the array elements
	num[0] = 10;
	num[1] = 20;
	num[2] = 30;
	num[3] = 40;
	num[4] = 50;

//Accessing and printing the array elements
	System.out.println("Array elements: ");
	for(int a = 0; a < num.length; a++) {
		System.out.println(num[a]);
	}
}
}