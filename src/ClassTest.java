import java.util.Scanner;

public class ClassTest {
	
	public static void main(String[]args)
	{
		Voiture vt1 = new Voiture();
		
		int roue = 4;
		String porte = "porte1";
		Voiture vt2 = new Voiture(roue, porte);
		
		Vehicule v1 = new Vehicule();
		String mattricule = "tunis";
		String nom ="bm";
		Vehicule v2 = new Vehicule(mattricule, nom);
		System.out.println("entrer un element");
		
		
	    Scanner sc = new Scanner(System.in);
	    
	   
	    int i = sc.nextInt();
	        
	    System.out.println("l'element saisie est :"+i);

		
	}
	}


