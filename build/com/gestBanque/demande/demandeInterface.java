package com.gestBanque.demande;

import java.util.ArrayList;

import metier.Demande;

public interface demandeInterface {
	 public ArrayList<Demande> AfficheListe();
	 public void AjouterAgency(Demande de);
	 public Demande Agency(String id);
	 public void ModifierDemande(Demande de);
	 public void SupprimerDemande(String id);
	
}
