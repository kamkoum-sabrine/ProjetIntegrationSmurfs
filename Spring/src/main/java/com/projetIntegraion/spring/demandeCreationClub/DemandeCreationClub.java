package com.projetIntegraion.spring.demandeCreationClub;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
@Entity
public class DemandeCreationClub {
	  private @Id @GeneratedValue Long id;
	  private String sujet;
	  private String nomClub;
	  private String logo;
	  @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	  private Date dateCreation;
	  private String activite;
	  private String president;
	  private String vicePresident;
	  private Long responsableClubId;
//	    @OneToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "artist_id")
//	    private User artist;
	  
	public DemandeCreationClub() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DemandeCreationClub(String sujet, String nomClub, String logo, String dateCreation, String activite,
		String president, String vicePresident, Long responsableClubId) throws ParseException {
	super();
//	this.sujet = sujet;
//	this.nomClub = nomClub;
//	this.logo = logo;
//	DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//	
//	this.dateCreation = df.parse(dateCreation);	
//	this.activite = activite;
//	this.president = president;
//	this.vicePresident = vicePresident;
//	this.responsableClubId = responsableClubId;
}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getActivite() {
		return activite;
	}
	public void setActivite(String activite) {
		this.activite = activite;
	}
	public String getPresident() {
		return president;
	}
	public void setPresident(String president) {
		this.president = president;
	}
	public String getVicePresident() {
		return vicePresident;
	}
	public void setVicePresident(String vicePresident) {
		this.vicePresident = vicePresident;
	}
	public Long getResponsableClubId() {
		return responsableClubId;
	}
	public void setResponsableClubId(Long artistId) {
		this.responsableClubId = artistId;
	}
	@Override
	public String toString() {
		return "DemandeCreationClub [id=" + id + ", sujet=" + sujet + ", nomClub=" + nomClub + ", logo=" + logo
				+ ", dateCreation=" + dateCreation + ", activite=" + activite + ", president=" + president
				+ ", vicePresident=" + vicePresident + ", responsableClubId=" + responsableClubId + "]";
	}
	 
}