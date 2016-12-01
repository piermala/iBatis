package it.alfasoft.pierangelo.model;

import java.io.Serializable;

public class Film implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private int id_film;
	
	private String titolo;
	private String annoPubblicazione;
	private String nomeRegista;
	private String genere;
	private String codiceFilm;
	
	
	
	public Film(String titolo, String annoPubblicazione, String nomeRegista,
			String genere, String codiceFilm) {
		super();
		this.titolo = titolo;
		this.annoPubblicazione = annoPubblicazione;
		this.nomeRegista = nomeRegista;
		this.genere = genere;
		this.codiceFilm = codiceFilm;
	}
	
	public Film(){}
	
	
	
	public int getId_film() {
		return id_film;
	}

	public void setId_film(int id_film) {
		this.id_film = id_film;
	}

	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(String annoPubblicazione) {
		this.annoPubblicazione = annoPubblicazione;
	}
	public String getNomeRegista() {
		return nomeRegista;
	}
	public void setNomeRegista(String nomeRegista) {
		this.nomeRegista = nomeRegista;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getCodiceFilm() {
		return codiceFilm;
	}
	public void setCodiceFilm(String codiceFilm) {
		this.codiceFilm = codiceFilm;
	}

	@Override
	public String toString() {
		return "Film  -  titolo = " + titolo + ", annoPubblicazione="
				+ annoPubblicazione + ", nomeRegista=" + nomeRegista
				+ ", genere=" + genere + ", codiceFilm=" + codiceFilm;
	}
	
}
