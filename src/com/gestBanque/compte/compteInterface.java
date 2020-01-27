package com.gestBanque.compte;

import java.util.List;

import metier.Compte;

public interface compteInterface {
	
	public void ajouterCompte(); 
	public void deleteCompte(Compte cpte);
	public List<Compte> afficheCompte(Compte cpte);
	

}
