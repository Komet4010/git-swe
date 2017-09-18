import java.util.Scanner; 
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input number");
		int number,num;
		number = keyboard.nextInt();
		num= number%2;

		if (num ==0)
		System.out.println("àÅ¢¤Ùè");
		else
		System.out.println("àÅª¤Õè");
	}

}