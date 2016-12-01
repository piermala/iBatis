package it.alfasoft.pierangelo.prova;

import it.alfasoft.pierangelo.model.Film;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class EsempioRead {

	public static void main(String[] args) throws IOException, SQLException {
	
		Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		
		
		/// SELECT ALL
		List<Film> listaFilm = smc.queryForList("Film.getAll", null);
		
		for (Film f : listaFilm){
			
			System.out.println(f);
			
		}
		
		
		/// SELECT FROM TITLE
		
		System.out.println("\n\n SELECT FROM TITLE");
		
		String titolo = "Oasis - Supersonic";
		Film f = (Film) smc.queryForObject("Film.getConTitolo",titolo);
		
		System.out.println(f);
		
		
	}
	
}
