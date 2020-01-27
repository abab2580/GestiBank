//package com.gestBanque.conseiller;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.List;
//
//import com.gestBanque.Connection.connectionDao;
//
//public class modalDao implements conseillerInterface {
//
//	// Décalaration des variables globales.
//
//	private Connection conn = null;
//	private PreparedStatement statement = null;
//	private ResultSet rs = null;
//
//	public modalDao() {
//
//	}
//
//	@Override
//	public void AjouterConseiller(modalDao c) {
//
//		String sql = "insert into conseiller (nom,mdp,email,telephone,matricule) values(?,?,?,?,?) ";
//
//		try {
//
//			conn = connectionDao.connection();
//
//		} catch (Exception e) {
//
//		}
//
//	}
//
//	@Override
//	public modalDao RechercherConseillerParNom(String name) {
//		String sql = "insert into conseiller (nom,mdp,email,telephone,matricule) values(?,?,?,?,?) ";
//
//		return null;
//	}
//
//	@Override
//	public modalDao RechercherConseiller(int matri) {
//		String sql = "";
//		return null;
//	}
//
//	@Override
//	public void ModifierConseiller(modalDao c) {
//		String sql = "";
//
//		try {
//
//			conn = connectionDao.connection();
//
//			statement = (PreparedStatement) conn.prepareStatement(sql);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//
//	@Override
//	public List<modalDao> AfficheListe() {
//		String sql = "";
//		
//		try {
//
//			conn = connectionDao.connection();
//
//			statement = (PreparedStatement) conn.prepareStatement(sql);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return null;
//	}
//
//	@Override
//	public List<modalDao> afficheListeConsParMatri(int matri) {
//		String sql = "";
//		
//		try {
//
//			conn = connectionDao.connection();
//
//			statement = (PreparedStatement) conn.prepareStatement(sql);
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return null;
//	}
//
//}
