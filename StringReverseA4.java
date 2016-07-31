import java.util.Scanner;

public class StringReverseA4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		char ans;
		
		do {
			
			StringBuffer str = new StringBuffer();
			
			System.out.print("Enter the string: ");
			str.append(s.nextLine());
		
			str.reverse();
		
			System.out.println("Reversed String: "+str);
			
			
			System.out.print("\nPress 'y' to try again.Press any other key to Exit.");
			ans=s.next().toLowerCase().charAt(0);
			s.nextLine();
		
		} while (ans=='y');
		s.close();
	}

}
