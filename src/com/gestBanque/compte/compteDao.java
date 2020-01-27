package com.gestBanque.compte;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.gestBanque.Connection.connectionDao;

import metier.Compte;

public class compteDao implements compteInterface {

	private Connection conn = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;

	// TODO tout est à faire en ce qui concerne les méthodes
	public compteDao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Ajoute le compte d'un client passé en param
	 * 
	 * 
	 * 
	 * @param cpte
	 * 
	 */

	@Override
	public void ajouterCompte() {
		// TODO Auto-generated method stub
		String sql = "select * from conseiller where matricule = ?";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Supprime le compte d'un client.
	 * 
	 * 
	 * 
	 * @param cpte
	 * 
	 */

	@Override
	public void deleteCompte(Compte cpte) {

		// TODO Auto-generated method stub
		String sql = "select * from conseiller where matricule = ?";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Affiche la liste des comptes d'un client.
	 * 
	 * 
	 * 
	 * @param cpte
	 * 
	 */

	@Override
	public List<Compte> afficheCompte(Compte cpte) {
		// TODO Auto-generated method stub à faire
		String sql = "select * from conseiller where matricule = ?";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

}
