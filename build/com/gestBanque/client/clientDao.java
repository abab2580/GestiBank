package com.gestBanque.client;

import java.util.ArrayList;

import metier.Client;

public class clientDao implements clientInterface {
	Connection conn = null;
	public clientDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void AjouterClient(Client c) {
		String sql ="INSERT INTO client(?,?,?)"; 
		try {
			Connection conn = connectionDao.connection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				
				c.setNom(rs.getString("nom"));
				c.motDepasse(rs.getString("Telephone"))
				c.set
				
				
			}
			
		} catch (Exception e) {
			
		}
		
	}

	@Override
	public Client RechercherClientParNom(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client RechercherClientC(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifierClient(Client c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Client> AfficheListe() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Client> AfficheListeCl(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
