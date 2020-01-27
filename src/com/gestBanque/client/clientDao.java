package com.gestBanque.client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gestBanque.Connection.connectionDao;

import metier.Client;
public class clientDao implements clientInterface {

	private Connection conn = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;

	public clientDao() {

	}
	
	/**

     * Ajoute le client  passé en param

     * 

     * @param c  

     */

	@Override

	// méthode qui permet l'ajout d'un client

	public void AjouterClient(Client c) {

		String sql = "INSERT INTO client(nom,mdp,email) values(?,?,?)";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

			if (c.getNom().equals(null) || c.getNom().length() < 3 || c.getNom().length() >= 20) {

				throw new IllegalArgumentException("Le format nom n'est pas respecté ");
			}

			statement.setString(1, c.getNom());

			if (c.getMotDepasse().equals(null) || c.getMotDepasse().length() <= 4 || c.getMotDepasse().length() >= 20) {

				throw new IllegalArgumentException("Le mdp format n'est pas respecté ");
			}

			statement.setString(2, c.getMotDepasse());

			if (c.getEmail().equals(null)) {

				throw new IllegalArgumentException("Le format mail n'est pas respecté ");
			}

			statement.setString(3, c.getEmail());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(c.getNom());

	}

	@Override
	public Client RechercherClientParId(int Id) {

		Client c = new Client();

		String sql = "select * from client where id = ? ";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

			statement.setInt(1, Id);

			System.out.println(Id);

			rs = statement.executeQuery();

			while (rs.next()) {

				c.setNom(rs.getString("nom"));
				c.setMotDepasse(rs.getString("Telephone"));
				c.setEmail(rs.getString("mdp"));

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return c;
	}
	
	/**

     * Modifier le client passé en param

     * 

     * @param c 

     */

	@Override
	public void ModifierClient(Client c) {

		String sql = "update client SET  nom = ?, mdp = ? , email = ? where Id = ? ";

		try {
			conn = connectionDao.connection();

			statement = (PreparedStatement) conn.prepareStatement(sql);

			statement.setString(1, c.getNom());

			statement.setString(2, c.getMotDepasse());

			statement.setString(3, c.getEmail());

			statement.setInt(4, c.getId());

			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public List<Client> AfficheListe() {
		List<Client> listCli = new ArrayList<Client>();
		try {
			conn = connectionDao.connection();
			Statement stm = (Statement) conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM client");

			while (rs.next()) {

				Client c = new Client();

				c.setId(rs.getInt("id"));

				c.setNom(rs.getString("nom"));

				c.setMotDepasse(rs.getString("mdp"));

				c.setEmail(rs.getString("email"));

				listCli.add(c);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return listCli;
	}

	@Override
	public List<Client> AfficheListeCl(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void SupprimerClient(int id) {
		String sql = "delete from client where id = ?";

		try {
			conn = connectionDao.connection(); // j'ouvre la connexion

			statement = (PreparedStatement) conn.prepareStatement(sql); // crée la requete préparée

			statement.setInt(1, id); // je fais le lien avec le paramètre caché.

			statement.execute();

		} catch (Exception e) {
			System.out.println("probleme de suppression");
			System.out.println(e.getStackTrace());
		}

	}

	public static void main(String[] args) {
		Client c = new Client();

		clientDao cDao = new clientDao();

		cDao.SupprimerClient(6);

		c = cDao.RechercherClientParId(2);

		System.out.println(c.getNom());

//		Client c =  new Client("Juan", "mdp18", "juan@test.com");
//
//		cDao.AjouterClient(c);
//		
//		System.out.println("----------------");
//		
//		c.setEmail("boubaker@gk.fr");
//		
//		c.setNom("boubaker");
//		
//		c.setId(2);
//		
//		c.setMotDepasse("azul123");
//		
//		cDao.ModifierClient(c);
//		
//		System.out.println();

	}

}
