import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		int nb = (int) (Math.random() * 51);
		ArrayList<Integer> Tab1 = new ArrayList<Integer>(nb);
		for (int i = 0; i < nb; i++) {
			int n1 = (int) (Math.random() * 9);
			Tab1.add(n1);
		//	System.out.println(Tab1.get(i));
		}
		boolean x= false;
		do {
					
					try {
						
	
				
				Scanner sc = new Scanner(System.in);
				System.out.println("entrer la taille :");
				int s = sc.nextInt();
				System.out.println(s);

				x=true;
				
			}
			catch(Exception e )
			{
				System.out.println("erreur");
				
			
		}		
		}while(x==false);
		
			
	}
}