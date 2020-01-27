package com.gestBanque.demande;

import java.util.List;

import metier.Demande;

public interface demandeInterface {
	
	 public void AjouterDemande(Demande de);
	 public List<Demande> AfficheListe();
	 public List<Demande> AfficheListeParStatut();
	 public void ChercherDemandeParId(int id );
	 public void ModifierDemande(Demande de);
	 public void SupprimerDemande(int id);
	
}
