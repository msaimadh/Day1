package square;
import java.util.*;
public class squareroot {
	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("number: ");
		number = s.nextInt ();
		int n = number*1;
		int sq = number*number;
		System.out.print("output:" + number + "*1=" + n + ",square: " + sq);
	}

}
