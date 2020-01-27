package com.gestBanque.client;

import java.util.ArrayList;

import entities.Client;

public interface clientInterface {
	
	public void AjouterClient(Client c);	
	public Client RechercherClientParNom(String name);	
	public Client RechercherClientC(int id);	
	public void ModifierClient(Client c);	
	public ArrayList<Client> AfficheListe();	
	public ArrayList<Client> AfficheListeCl(int id);

}
