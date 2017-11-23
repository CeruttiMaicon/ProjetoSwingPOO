package projetoswingpoo.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import projetoswingpoo.model.clienteprestador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClientePrestadorDAO {
	
	private Connection mConn;
	
	public ClientePrestadorDAO(){
		
		mConn = (new ConnectionFactory()).getConnection();
			
	}
	
	public void saveinfo(clienteprestador model){
		
		String sql = "Insert into clienteprestador(CPF,RG,CEP,endereco,datanascimento,nomeprestador,usuario,senha)"+
			"values(?,?,?,?,?,?,?,?);";
		try{
			PreparedStatement stmt = (PreparedStatement) mConn.prepareStatement(sql);
		}

		
	}
	
	

}
