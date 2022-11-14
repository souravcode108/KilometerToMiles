import java.util.Scanner;
class KilometerToMiles{
	public static void main(String []args){
	System.out.println("enter the kilometers");

	Scanner sc=new Scanner(System.in);
	double a=sc.nextDouble();

	double b=a*0.621371;

	System.out.println("which is eqivalent to " +b  +"  miles" );

	}
}