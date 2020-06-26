import java.util.*;
public class RomanNumeral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String r = sc.nextLine();
		int number = 0;
		for(int i = 0; i < r.length(); i++) {
			char c = r.charAt(i);
			char d = ' ';
			if(i != r.length() - 1) d = r.charAt(i+1);
			if(c == 'M') number += 1000;
			else if(c == 'C' && d == 'M') {
				number += 900;
				i++;
			}
			else if(c == 'D') number += 500;
			else if (c == 'C' && d == 'D') {
				number += 400;
				i++;
			}
			else if (c == 'C') number += 100;
			else if (c == 'X' && d == 'C') {
				number += 90;
				i++;
			}
			else if (c == 'L') number += 50;
			else if (c == 'X' && d == 'L') {
				number += 40;
				i++;
			}
			else if (c == 'X') number += 10;
			else if (c == 'I' && d == 'X') {
				number += 9;
				i++;
			}
			else if (c == 'V') number += 5;
			else if (c == 'I' && d == 'V') {
				number += 4;
				i++;
			}
			else number ++;
		}
		System.out.println(number);
	}

}
