package ted.zhang.uva.Problem;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The 3N + 1 problem
 * https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=36
 * 
 * @author skuld1012
 */

class UVA100 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner enter = new Scanner(System.in);

		while (enter.hasNextInt()) {
			int firstInt = enter.nextInt();
			if(!enter.hasNextInt()) {
				break;
			}
			int secondInt = enter.nextInt();
			int startInt, endInt, max = 1;
			if (firstInt > secondInt) {
				startInt = secondInt;
				endInt = firstInt;
			} else {
				startInt = firstInt;
				endInt = secondInt;
			}
			if(startInt <= 0 || endInt >= 1000000) {
				continue;
			}
			for (int i = startInt; i <= endInt; i++) {
				int count = 1;
				int processingInt = i;
				while (processingInt != 1) {
					if (processingInt % 2 == 0) {
						processingInt = processingInt / 2;
					} else {
						processingInt = processingInt * 3 + 1;
					}
					count++;
				}
				if (count > max) {
					max = count;
				}
			}
			System.out.println(firstInt + " " + secondInt + " " + max);
		}
	}

}
