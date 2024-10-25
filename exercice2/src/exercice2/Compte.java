package exercice2;

public class Compte {
	//les attributs
	private int num;
	private double solde;
 	private static int nbCompteconstruit=0;//compteur attribut de classe
	//les classes
	public Compte(int num, double solde) {
		this.num=num;
		this.solde=solde;
		nbCompteconstruit++;
		
	}
	public void depot(double valeur) {
		solde=solde+valeur;
	}
	void retrait(double valeur) {
		if (solde >=valeur && valeur>0) {
			solde-=valeur;
		}
	}
	public double getSolde() {
		return(solde);
		
	}
	public static int getNbComptesConstruit() {
		return(nbCompteconstruit);
	}
	public void affichierSolde() {
		System.out.println(solde);
	}
	public void setSolde(double s) {
		if(s>0) {
			solde=s;
		}
	}
	public String toString() {
		return("le compte son numero est "+num+" son solde est "+solde);
		
	}
	public void virer(float valeur,Compte destinataire) {
		if(valeur>0 && solde>=valeur) {
			solde-=valeur;
			destinataire.depot(valeur);
		}
		
		
	}
	public static Compte plusSolde(Compte c1,Compte c2) {
		if (c1.getSolde() > c2.getSolde())
		{
			return(c1);
		}
		else {
			return(c2);
		}
		
		
	}
	
	public boolean equals(Object o) {
		Compte c=(Compte)o;
		if (c==null) {
			return(false);
		}
		if( this.num==c.num&& this.solde==c.solde) {
			return(true);
		}
		else { return(false);}
	}
}
