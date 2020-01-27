package com.gestBanque.demande;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gestBanque.Connection.connectionDao;

import metier.Demande;

public class demandeDao implements demandeInterface {

	@Override
	public ArrayList<Demande> AfficheListe() {
		String sql ="select* from demande ";
		try {
			
			Connection conn= connectionDao.connection();
			PreparedStatement statement = conn.prepareStatement(sql);
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				Demande de = new Demande();
				
				de.setId(rs.getInt("id"));
				de.setTypeDemande(rs.getString("TypeDemande"));
				de.setTelephone(rs.getString("Telephone"));
				de.setNbEnfants(rs.getInt("");
				de.
			}
		} catch (SQLException e) {


			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void AjouterAgency(Demande de) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Demande Agency(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ModifierDemande(Demande de) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SupprimerDemande(String id) {
		// TODO Auto-generated method stub
		
	}

}
