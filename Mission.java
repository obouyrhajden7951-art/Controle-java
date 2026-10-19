package controle;
public class Mission {
    private int nbJours;
    private Employe employe; 
    private Projet projet;   

    public Mission(Employe employe, Projet projet, int nbJours) {
        this.employe = employe;
        this.projet = projet;
        this.nbJours = nbJours;
    }

   
    public double calculerMontant() {
        return employe.calculerCout(nbJours);
    }

    public void afficherRecapitulatif() {
        System.out.println("Récapitulatif Mission :");
        employe.afficherDetails();
        System.out.println(projet.toString());
        System.out.println("Durée: " + nbJours + " jours");
        System.out.println("Montant: " + calculerMontant() + " DH");

    }
}