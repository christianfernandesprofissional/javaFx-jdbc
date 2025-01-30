package db;

public class DbIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException(String msg) {
		super(msg);
	}

}


/*
 *Essa classe foi criada devido a um erro que ocorre quando vc tenta apagar
 * uma informação de alguma tabela e essa tabela fornece uma referencia pra outra tabela
 */

//PROGRAMA COM DELETE

/*package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {

		Connection conn = null; 
		PreparedStatement st = null;
		 try {
			 conn = DB.getConnection();
			 st = conn.prepareStatement("DELETE from seller WHERE Id = ?");
			 
			 st.setInt(1, 9);
			 
			 int rowsAffected = st.executeUpdate();
			 
			 System.out.println("Rows affected: " + rowsAffected);
		 }catch(SQLException e) {
			 throw new DbIntegrityException(e.getMessage());
		 }
		 finally {
			 DB.closeStatement(st);
			 DB.closeConnection();
		 }
	}

}

*/
 