import java.util.Scanner;
public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i,nb,cpt,max=0,min=20, moy=0;
		Scanner clavier = new Scanner(System.in);
		double NOTES[];
		
		System.out.print("Entrer le nombre de notes à stocker : ");
		nb = clavier.nextInt(); clavier.nextLine();
		
		NOTES = new double [nb];
		
		for (cpt=0 ; cpt < nb ; cpt++)
		{
			System.out.print("Entrer la note n." + (cpt +1) + ": ") ;		
			NOTES[cpt] = clavier.nextDouble(); clavier.nextLine();
		}
		
		System.out.print(NOTES[0]);
		
		System.out.print("Les notes saisies sont : " );
		
		for (i=0;i<nb;i++);
		{
			System.out.print(NOTES[i]);
		}	
		
	}
}

