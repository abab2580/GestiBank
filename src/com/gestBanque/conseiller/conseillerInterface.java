package com.gestBanque.conseiller;

import java.util.List;

import metier.Conseiller;

public interface conseillerInterface {
	
	public void AjouterConseiller(Conseiller c);
	public Conseiller RechercherConseillerParNom(String name);
	public Conseiller RechercherConseiller(int matri);	
	public void ModifierConseiller(Conseiller c);	
	public List<Conseiller> AfficheListe();
	public List<Conseiller> afficheListeConsParMatri(int matri);
	

}
