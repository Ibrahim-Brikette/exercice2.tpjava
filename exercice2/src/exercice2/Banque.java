package exercice2;

public class Banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client ibra=new Client("ibrahim");
		System.out.println(ibra.getNom());
		System.out.println(ibra.getNbComptes());
		ibra.ajouterCompte(10,1200.23 );
		ibra.ajouterCompte(11,1200.5 );
		ibra.ajouterCompte(1,1200.200 );
		ibra.afficherSolde();
		System.out.println("nombres de comtes de "+ibra.getNom()+" est "+ibra.getNbComptes());
		System.out.println("nombres de comptes construit "+Compte.getNbComptesConstruit());
		Client bimou=new Client("ibrahim");
		System.out.println(ibra.getNom());
		System.out.println(ibra.getNbComptes());
		ibra.ajouterCompte(10,1200.23 );
		ibra.ajouterCompte(11,1200.5 );
		ibra.ajouterCompte(1,1200.200 );	
		System.out.println(ibra.equals(bimou));
		
	}

}
