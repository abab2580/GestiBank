package com.gestBanque.admin;

import java.util.ArrayList;

import com.gestBanque.conseiller.Conseiller;

import entities.Demande;

public interface administrateurInterface {
	
	public ArrayList<Demande> AfficheListeDemandes();	
	public ArrayList<Demande> AfficheListeDemandesParDate();	
	public ArrayList<Demande> AfficheListeDemandesParStatut(String statut);
	public void AjouterConseiller(Conseiller c);
	public Conseiller RechercherConseillerParNom(String name);
	public Conseiller RechercherConseiller(int matri);	
	public void ModifierConseiller(Conseiller c);
	
	
	

}
