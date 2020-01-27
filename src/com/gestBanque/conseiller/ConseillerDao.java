package com.gestBanque.conseiller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.gestBanque.Connection.connectionDao;

import metier.Conseiller;

public class ConseillerDao implements conseillerInterface {

	// Décalaration des variables globales.

	private Connection conn = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;

	public ConseillerDao() {

	}

	@Override
	public void AjouterConseiller(Conseiller c) {

		String sql = "insert into conseiller (nom,mdp,email,telephone,matricule) values(?,?,?,?,?) ";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, c.getNom());
			statement.setString(2, c.getMotDepasse());
			statement.setString(3, c.getEmail());
			statement.setString(4, c.getTelephone());
			statement.setString(1, c.getMatricule());
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Conseiller RechercherConseillerParNom(String name) {
		String sql = "selec* from conseiller where nom = ?  ";
		
		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			
			
			

		} catch (Exception e) {
			
		}
		return null;
	}

	@Override
	public Conseiller RechercherConseiller(int matri) {
		
		String sql = "";
		
		try {

			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
    
	
	// à faire non fini !!!!!!!!
	@Override
	public void ModifierConseiller(Conseiller c) {
		
		String sql = "update conseiller SET  nom = ?, mdp = ? , email = ? where Id = ? ";

		try {

			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, c.getNom());
			statement.setString(2, c.getMotDepasse());
			statement.setString(3, c.getEmail());
			statement.setInt(4, c.getId());
			statement.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Conseiller> AfficheListe() {
		String sql = "";
		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<Conseiller> afficheListeConsParMatri(int matri) {
		
		String sql = "select * from Conseiller where matri = ?";
		
		try {

			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

}
