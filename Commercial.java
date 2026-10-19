package controle;

public class Commercial extends Employe {
	private double tauxPrime;

	public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime = tauxPrime;
	}

	@Override
	public double calculerCout(int nbJours) {
		double cout;
		double montantbase = tarifJournalier * nbJours;
		return cout=montantbase + (montantbase * tauxPrime);
	}

	public void afficherDetails() {
		System.out.print("[Commercial] Prime " + (tauxPrime * 100) + "% - ");
		super.afficherDetails();
	}
}
