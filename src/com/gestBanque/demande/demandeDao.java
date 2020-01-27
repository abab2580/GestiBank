package com.gestBanque.demande;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gestBanque.Connection.connectionDao;

import metier.Demande;

public class demandeDao implements demandeInterface {
	
	// Décalaration des variables globales. 
	
	private Connection conn = null;
	private PreparedStatement statement = null;
	private ResultSet rs = null;
	
	
	private java.sql.Date SQLD;
	private String DN;
	private String DTN;
	
	//method of transforming a chain representing a date in sql format yyyy-mm-dd into java chain dd-mm-yyyy
		private String SQLString(String source) {
			String res= null;
			res =source.substring(8)+"-"+source.substring(5,7)+"-"+source.substring(0,4);
			return res;
		}
		
		//method of transforming a chain representing a java chain dd-mm-yyyy in date in sql format yyyy-mm-dd
		private String StringSqlDate(String source) {
			String res= null;
			res=source.substring(6)+"-"+source.substring(3,5)+"-"+source.substring(0,2);
			return res;
		}

	// Méthode d'ajout d'une demande. 
	
	@Override
	public void AjouterDemande(Demande de) {
		
		String sql ="insert into demande  (TypeDemande,DateDemande,nom ,mdp,email,Telephone,NbEnfants,Identifiant,Document,Statut)  values(?,?,?,?,?,?,?,?,?,?) ";
		
		try {
			
			conn = connectionDao.connection();
			statement = (PreparedStatement) conn.prepareStatement(sql);
			statement.setString(1, de.getNom()); 
			statement.setString(2, de.getMdp());
			statement.setString(3, de.getEmail());
			statement.setString(4, de.getEmail());
			statement.setString(5, de.getEmail());
			statement.setString(6, de.getTelephone()); 
			statement.setInt(7, de.getNbEnfants());     
			statement.setString(8, de.getIdentifiant());	
			statement.setString(9, de.getDocument());	
			statement.setString(10, de.getStatut());	
			statement.executeUpdate();
		    statement.close();
			
		} catch (Exception e) {
			System.out.println("pblm insert");
			e.printStackTrace();	
		}	
	}
	
	// Méthode d'ajout d'une demande. 
	
	@Override
	public List<Demande> AfficheListe() {
		String sql ="select * from demande";
		List<Demande> listDemandes =new ArrayList<Demande>();
		try {	
			conn= connectionDao.connection();
			PreparedStatement statement = conn.prepareStatement(sql);
			rs=statement.executeQuery();
			while(rs.next())
			{
				Demande de = new Demande();
				de.setId(rs.getInt("id"));
				de.setTypeDemande(rs.getString("TypeDemande"));
				de.setDateDemande(rs.getString("DateDemande"));
				de.setNom(rs.getString("nom"));
				de.setMdp(rs.getString("mdp"));
				de.setEmail(rs.getString("email"));
				de.setTelephone(rs.getString("Telephone"));
				de.setIdentifiant(rs.getString("identifiant"));
				de.setNbEnfants(rs.getInt("NbEnfants"));
				de.setDocument(rs.getString("Document"));
				de.setStatut(rs.getString("Statut"));
				listDemandes.add(de);
			}
			statement.close();
		} catch (SQLException e) {
			
			System.out.println("pb sql list");
			e.printStackTrace();
		}
		return listDemandes;
	}

	@Override
	public void ModifierDemande(Demande de) {
		String sql = "update demande set TypeDemande=?,dateDemande=?,Telephone=?,NbEnfants=?,Identifiant=?,Document=?,Statut=? where id=?";
		try {
			Connection conn= connectionDao.connection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, de.getTypeDemande());
			
			     DN = String.valueOf(SQLD);
			     DTN=this.StringSqlDate(DN);
			     SQLD=java.sql.Date.valueOf(DTN);
			     st.setDate(2, SQLD);
			     
			st.setString(3,de.getTelephone());
			st.setInt(4,de.getNbEnfants());
		    st.setString(5,de.getIdentifiant());
		    st.setString(6,de.getDocument());
		    st.setString(7,de.getStatut());
		    st.setInt(8, de.getId());
			st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	

	@Override
	public void SupprimerDemande(int id) {
		
		String sql ="delete  from demande where id = ?";

		try {
			conn = connectionDao.connection(); 
			statement = (PreparedStatement) conn.prepareStatement(sql); 
			statement.setInt(1, id); 
			statement.execute();
			statement.close();

		} catch (Exception e) {
			System.out.println("probleme de suppression");
			System.out.println(e.getStackTrace());
		}
		
	}
	

	@Override
	public List<Demande> AfficheListeParStatut() {
		String  sql =" select * from demande where statut =?";
		List<Demande> ListeDeParStatut= new ArrayList<Demande>();
		Demande de= new Demande();
		try {
			Connection conn= connectionDao.connection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1,de.getStatut() );
			ResultSet rs=st.executeQuery();
			while(rs.next())
			{
				
				de.setId(rs.getInt("id"));
				de.setTypeDemande(rs.getString("TypeDemande"));
				
				SQLD=rs.getDate("dateDemande");
			     DN= String.valueOf(SQLD);
			     DTN=this.StringSqlDate(DN);
			     de.setDateDemande(DTN);    
			 
				de.setTelephone(rs.getString("Telephone"));
				de.setNbEnfants(rs.getInt("NbEnfants"));
				de.setIdentifiant(rs.getString("Identifiant"));
				de.setDocument(rs.getString("Document"));
				de.setStatut(rs.getString("Statut"));
				ListeDeParStatut.add(de);
			}
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ListeDeParStatut;
	}
		
	@Override
	public void ChercherDemandeParId(int id) {
		String  sql =" select * from demande where id =?";
		
		Demande de = null;
		try {
			Connection conn= connectionDao.connection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
			
			if (rs.next()) {
				de=new Demande();
			de.setId(rs.getInt("id"));
			de.setTypeDemande(rs.getString("TypeDemande"));
			
			SQLD=rs.getDate("dateDemande");
		     DN= String.valueOf(SQLD);
		     DTN=this.StringSqlDate(DN);
		     de.setDateDemande(DTN);    
		 
			de.setTelephone(rs.getString("Telephone"));
			de.setNbEnfants(rs.getInt("NbEnfants"));
			de.setIdentifiant(rs.getString("Identifiant"));
			de.setDocument(rs.getString("Document"));
			de.setStatut(rs.getString("Statut"));
			st.close();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
