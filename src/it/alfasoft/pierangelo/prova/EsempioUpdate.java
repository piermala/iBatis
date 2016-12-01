package it.alfasoft.pierangelo.prova;

import it.alfasoft.pierangelo.model.Film;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EsempioUpdate {

public static void main(String[] args) throws IOException, SQLException {
		
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
	    SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		
		Film f1 = new Film("bbb", "2008", "bbb", "bbb", "bbb");
		
		
		
		/// UPDATE
		f1.setTitolo("The Ring");
		f1.setId_film(3);
		smc.update("Film.update",f1);
		
		
		
		
	}
}
