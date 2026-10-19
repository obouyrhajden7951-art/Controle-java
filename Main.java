package controle;

import controle.Commercial;
import controle.Ingenieur;
import controle.Employe;
import controle.Projet;
import controle.Mission;

public class Main {
	public static void main(String[] args) {
		Ingenieur I1 = new Ingenieur("ART134", "Ahmed", 500, 4);
        Ingenieur I2 = new Ingenieur("IRF56", "Fatima", 350, 2);
        Commercial C1 = new Commercial("CPM08", "Youssef", 300, 0.10);
        Commercial C2 = new Commercial("XBG67", "Sara", 400, 0.15);
        
        Employe[] employes = new Employe[4];
        employes[0] = I1;
        employes[1] = I2;
        employes[2] = C1;
        employes[3] = C2;
        
        Projet p1 = new Projet("P356", "Site de commerce ");
        Projet p2 = new Projet("P869", "GID-AREF");
        
        I2.setSuperieur(I1);
        C1.setSuperieur(I1); 
        C2.setSuperieur(I1); 

        
        double total = 0;
        for (int i = 0; i < missions.length; i++) {
            missions[i].afficherRecapitulatif();
            total += missions[i].calculerMontant();
        }

        Mission[] missions = new Mission[4];
        missions[0] = new Mission(I1, p1, 3);
        missions[1] = new Mission(I2, p1, 2);
        missions[2] = new Mission(I1, p2, 4);
        missions[3] = new Mission(C2, p2, 2);
        
        
        
	}
}
