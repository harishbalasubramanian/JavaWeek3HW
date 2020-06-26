import java.util.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean prime = true;
		for(int i = 2; i <= Math.sqrt(a); i++) {
			if(a % i == 0) {
				System.out.println(a+" is not prime");
				prime = false;
				break;
			}
		}
		if(prime) {
			System.out.println(a+" is prime");
		}
	}

}
