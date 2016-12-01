package it.alfasoft.pierangelo.prova;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import it.alfasoft.pierangelo.model.Film;

public class EsempioInsert {

	public static void main(String[] args) throws IOException, SQLException {
		
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	    SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		
		Film f1 = new Film("il signore degli anelli", "2002", "jtk", "fantascienza", "hhhh");
		
		/// INSERT
		
		smc.insert("Film.insert",f1);
		
		

		
		
		
	}
	
	
}
