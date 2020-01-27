package com.gestBanque.admin;
import java.util.List;

import com.gestBanque.conseiller.ConseillerDao;

import metier.Conseiller;
import metier.Demande;

public interface administrateurInterface {
	
	public List<Demande> AfficheListeDemandes();	
	public List<Demande> AfficheListeDemandesParDate();	
	public List<Demande> AfficheListeDemandesParStatut(String statut);
	public void AjouterConseiller(Conseiller c);
	public ConseillerDao RechercherConseillerParNom(String name);
	public ConseillerDao RechercherConseiller(int matri);	
	public void ModifierConseiller(Conseiller c);
	public void affecterClient();

}
