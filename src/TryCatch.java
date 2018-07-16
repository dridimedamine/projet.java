import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("donner un entier :");
		 Scanner sc = new Scanner(System.in);
		    
		   try {
			   
		   
		    int i = sc.nextInt();
		        
		    System.out.println("l'element saisie est :"+i);

	}catch(Exception e)
		   {
		System.out.println("wrong");
		   }

}
}
