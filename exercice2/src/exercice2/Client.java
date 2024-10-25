package exercice2;

public class Client {
	//les attributs
	private int nbComptes=0;
	public Compte comptes[]=new Compte[100];
	private String name;
	//les méthodes
	public Client( String name) {
		 
		this.name=name;
	}
	public String getNom() {
		return(name);
	}
	public int getNbComptes() {
		return(this.nbComptes);
	}
    // Méthode pour ajouter un compte au client
    public void ajouterCompte(int num,double solde) {
        if (nbComptes < 100) {
            comptes[nbComptes] = new Compte(num,solde);
            nbComptes++;
        }
    }


    // Méthode pour obtenir le solde total de tous les comptes du client
   public double getSolde() {
	   double somme=0;
	   for (int i=0;i<nbComptes;i++) {
		   somme+=comptes[i].getSolde();
	   }
	   return somme;
   }
    // Méthode pour afficher le solde total du client
    public void afficherSolde() {
        System.out.println("Solde total de " + this.name + " : " + this.getSolde());
    }
    
    public String toString() {
        return "Client : " + this.name + ", Nombre de comptes : " + this.nbComptes+" son solde est: "+this.getSolde();
    }
	public boolean equals(Object o) {
		Client c=(Client)o;
		if(this.nbComptes !=c.nbComptes && this.name.equals(c.name)==false) {
			return(false);
		}
		else {
			int i=0;
			boolean tes=true;
			
			while(i<nbComptes && tes) {
				if(this.comptes[i].equals(c.comptes[i])) {
					i++;
					
				}
				else {
					tes=false;break;
				}
			}
			return(tes);
			
		}
	
	}
}
