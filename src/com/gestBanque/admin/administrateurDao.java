package com.gestBanque.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import com.gestBanque.Connection.connectionDao;
import com.gestBanque.conseiller.ConseillerDao;
import metier.Conseiller;
import metier.Demande;

public class administrateurDao implements administrateurInterface {

	private Connection conn = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;

	public administrateurDao() {
		// constructeur vide
	}

	@Override
	public List<Demande> AfficheListeDemandes() {
		// TODO Auto-generated method stub

		String sql = "select * from demande";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Demande> AfficheListeDemandesParDate() {
		// TODO Auto-generated method stub
		
		// méthode pour afficher la liste des demandes par date

		String sql = "select * from demande";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	@Override
	public List<Demande> AfficheListeDemandesParStatut(String statut) {
		// TODO Auto-generated method stub
		// méthode pour afficher la liste des demandes par statut

		String sql = "select * from demande where statut = ? ";
		

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1,"nonTrt");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void AjouterConseiller(Conseiller c) {

		String sql = "insert into conseiller (nom,mdp,email,telephone,matricule) values(?,?,?,?,?)";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

			statement.setString(1, c.getNom());

			statement.setString(2, c.getMotDepasse());

			statement.setString(3, c.getEmail());

			statement.setString(4, c.getTelephone());

			statement.setString(5, c.getMatricule());

			statement.executeUpdate();

		} catch (Exception e) {

			System.out.println("fail insert conseiller");

			e.printStackTrace();

		}

	}
	
	/**

     * Recherche le conseiller par le nom passé en param

     * 

     * @param name  est un string  

     */


	@Override

	public ConseillerDao RechercherConseillerParNom(String name) {
		// TODO Auto-generated method stub
		
		String sql = "";
		String exampleString = "";
		try {
			conn = connectionDao.connection();
				
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
	
	/**

     * Recherche le conseiller par le nom passé en param

     * 

     * @param matri est le matricule du conseiller   

     */


	@Override
	public ConseillerDao RechercherConseiller(int matri) {
		// TODO Auto-generated method stub
		String sql = "select * from conseiller where matricule = ?";

		try {
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	/**

     * Modifie le cconseiller c passé en param

     * 

     * @param c  

     */


	@Override
	public void ModifierConseiller(Conseiller c) {

		String sql = "UPDATE Conseiller SET nom= ?,mdp = ?,email = ?,telephone = ?,matricule= ? WHERE id = ?";

		try {

			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

			statement.setString(1, c.getNom());

			statement.setString(2, c.getMotDepasse());

			statement.setString(3, c.getEmail());

			statement.setString(4, c.getTelephone());

			statement.setString(5, c.getMatricule());

			statement.setInt(6, c.getId());

			statement.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	/**

     * affecte une demande à un conseiller en cours de codage 

     * 

     * @param c  

     */
 

	@Override
	public void affecterClient() {
		
		// TODO méthode qui gère l'affectation des clients et leurs conseillers associés 
		
		String sql = "insert intoINSERT INTO affectation(ConseillerID,demandeID,AdministrateurID) values(?,?,?) ";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
		
	
	
	public static void main(String[] args) {

    	administrateurDao A = new administrateurDao();

//		Conseiller c = new Conseiller("Tapie", "om1993", "btapie@gmail.com", "0614919203", "1456321");

//		A.AjouterConseiller(c);
    	
    	Conseiller c = new Conseiller(1,"Aulas", "ol1993", "Aulas@gmail.com", "0614919203", "1456321");
	
		A.ModifierConseiller(c);

	}

}
