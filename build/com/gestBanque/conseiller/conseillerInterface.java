package com.gestBanque.conseiller;

import java.util.ArrayList;

public interface conseillerInterface {
	
	public void AjouterConseiller(Conseiller c);
	public Conseiller RechercherConseillerParNom(String name);
	public Conseiller RechercherConseiller(int matri);	
	public void ModifierConseiller(Conseiller c);	
	public ArrayList<Conseiller> AfficheListe();	
	public ArrayList<Conseiller> AfficheListeCons(int matri);

}
