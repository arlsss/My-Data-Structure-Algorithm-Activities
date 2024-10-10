import java.util.Scanner;

	public class ArrayInitialization {
		public static void main (String [] args) {

			String [] num = new String[3];

			num[0] = "Kapoy";
			num[1] = "na kaayu";
			num[2] = "Sir!!";

			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
		}
	}