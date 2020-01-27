package com.gestBanque.client;

import java.util.List;

import metier.Client;

public interface clientInterface {
	
	public void AjouterClient(Client c);
	public void SupprimerClient(int id);
	public Client RechercherClientParId(int id);	
	public void ModifierClient(Client c);	
	public List<Client> AfficheListe();	
	public List<Client> AfficheListeCl(int id);

}
