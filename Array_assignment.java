import java.util.*;
class Array_assignment{
	public static void main(String[] args) {
		int i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("No. of elements you are going to use: ");
		int range = sc.nextInt();
		int x[] = new int[range];
		for(i=0;i<range;i++){
			System.out.println("Enter the "+(i+1)+"th number: ");
			x[i] = sc.nextInt();
			sum = sum + x[i];
		}
		System.out.println("Sum : "+sum);
	}
}
