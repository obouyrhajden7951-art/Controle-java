package controle;

public class Ingenieur extends Employe {
	
	private int nivrauExpertise;
	
	public Ingenieur(String matricule, String nom, double tarifJournaliser, int nivrauExpertise) {
		super(matricule, nom, tarifJournaliser);
		this.nivrauExpertise = nivrauExpertise;
	}

	@Override
	public double calculerCout(int nbJours) {
		int cout;
		if(nivrauExpertise<3) {
			cout=nivrauExpertise*nbJours;
			return cout;
		}else {
			cout=(nivrauExpertise*nbJours)+(100*nbJours);
			return cout;
		}
		
	}
}
