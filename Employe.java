package controle;
public abstract class Employe {
    protected static String matricule;
    protected static String nom;
    protected static double tarifJournalier;
 
    private Employe superieur;

    public Employe(String matricule, String nom, double tarifJournalier) {
        this.matricule = matricule;
        this.nom = nom;
        this.tarifJournalier = tarifJournalier;
        this.superieur = null;
    }

    public String getMatricule() {
        return matricule;
    }

    public abstract double calculerCout(int nbJours);

    public void afficherDetails() {
        System.out.println("Matricule: " + matricule + " | Nom: " + nom + " | Tarif: " + tarifJournalier + " DH");
    }

    public void setSuperieur(Employe superieur) {
        if (superieur == this) {
            System.out.println("Erreur: Un employé ne peut pas être son propre supérieur !");
            return;
        }
        this.superieur = superieur;
    }

    public Employe getSuperieur() {
        return superieur;
    }
    
    public String getNom() {
        return nom;
    }
}
