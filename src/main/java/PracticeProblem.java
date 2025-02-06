import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String strOne = input.nextLine();
		System.out.println(strOne.charAt(0));
		input.close();
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		boolean bool= input.nextBoolean();
		System.out.println(!bool);
		input.nextLine();
		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int a = input.nextInt();
		System.out.println(a > 5);
		input.nextLine();
		input.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double d = input.nextDouble();
		System.out.println( d >= -2 && d <= 2);
		input.nextLine();
		input.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String s = input.nextLine();
		System.out.println(a .equalsto("Hello World"));
		input.close();

	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int n = input.nextInt();
		input.nextLine();
		int m = input.nextInt();
		input.nextLine();
		System.out.println(n <= m);
		input.close();

	}

	public static void q7() {
		//Write question 7 code here
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double p = input.nextDouble();
		input.nextLine();
		double o = input.nextDouble();
		input.nextLine();
		System.out.println(p >= o);
		input.close();
	}

}

