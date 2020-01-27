package com.gestBanque.admin;

import java.util.ArrayList;

import com.gestBanque.conseiller.Conseiller;

import entities.Demande;

public class administrateurDao implements administrateurInterface {

	public administrateurDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Demande> AfficheListeDemandes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Demande> AfficheListeDemandesParDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Demande> AfficheListeDemandesParStatut(String statut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AjouterConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Conseiller RechercherConseillerParNom(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Conseiller RechercherConseiller(int matri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifierConseiller(Conseiller c) {
		// TODO Auto-generated method stub
		
	}

}
