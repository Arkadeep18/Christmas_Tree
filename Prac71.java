import java.util.*;
public class Prac71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x=sc.nextInt();
		System.out.println("Enter y");
		int y=sc.nextInt();
		System.out.println("Enter z");
		int z=sc.nextInt();
							
								//CHRISTMAS TREE🎄
		
		for(int a=1;a<=x;a++) {
			for(int b=1;b<=x-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int a=4;a<=x;a++) {
			for(int b=1;b<=x-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int a=5;a<=x;a++) {
			for(int b=1;b<=x-a;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		int space=8;
		for(int a=1;a<=y;a++) {
			for(int b=1;b<=space;b++) {
				System.out.print(" ");
			}
			for(int b=1;b<=z;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	System.out.println("🎄ℳℯ𝓇𝓇𝓎 𝒞𝒽𝓇𝒾𝓈𝓉𝓂𝒶𝓈🎄");
	
	}

}
