package it.alfasoft.pierangelo.prova;

import it.alfasoft.pierangelo.model.Film;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EsempioDelete {
	
	public static void main(String[] args) throws IOException, SQLException {

		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);

		Film f1 = new Film("bbb", "2008", "bbb", "bbb", "bbb");

		// / DELETE
		int id = 4;
		smc.delete("Film.delete", id);

	}
	
}
