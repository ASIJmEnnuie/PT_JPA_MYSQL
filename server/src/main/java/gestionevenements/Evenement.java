package gestionevenements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEvt;
    private String nomEvt;
    private String lieuEvt;
    private String orgaEvt;
    private String dateEvt;
    private String heureEvt;
    private String descEvt;
    private int nbInscEvt;
    private int nbPlacesEvt;
    private String imageEvt;

    public Evenement() {

    }
    
    public Evenement(int id, String nom, String lieu, String orga, String date, String heure,
                     String description, int nb_inscriptions, int nb_places, String image) {
        this.idEvt = id;
        this.nomEvt = nom;
        this.lieuEvt = lieu;
        this.orgaEvt = orga;
        this.dateEvt = date;
        this.heureEvt = heure;
        this.descEvt = description;
        this.nbInscEvt = nb_inscriptions;
        this.nbPlacesEvt = nb_places;
        this.imageEvt = image;
    }

    public int getIdEvt() {
        return idEvt;
    }

    public String getNomEvt() {
        return nomEvt;
    }

    public String getLieuEvt() {
        return lieuEvt;
    }

    public String getOrgaEvt() {
        return orgaEvt;
    }

    public String getDateEvt() {
        return dateEvt;
    }

    public String getHeureEvt() {
        return heureEvt;
    }

    public String getDescEvt() {
        return descEvt;
    }

    public int getNbInscEvt() {
        return nbInscEvt;
    }

    public int getNbPlacesEvt() {
        return nbPlacesEvt;
    }

    public String getImageEvt() {
        return imageEvt;
    }

    public void setIdEvt(int id) {
        this.idEvt = id;
    }

    public void setNomEvt(String nom) {
        this.nomEvt = nom;
    }

    public void setLieuEvt(String lieu) {
        this.lieuEvt = lieu;
    }

    public void setOrgaEvt(String organisateur) {
        this.orgaEvt = organisateur;
    }

    public void setDateEvt(String date) {
        this.dateEvt = date;
    }

    public void setHeureEvt(String heure) {
        this.heureEvt = heure;
    }

    public void setDescEvt(String description) {
        this.descEvt = description;
    }

    public void setNbInscEvt(int nb_inscriptions) {
        this.nbInscEvt = nb_inscriptions;
    }

    public void setNbPlacesEvt(int nb_places) {
        this.nbPlacesEvt = nb_places;
    }

    public void setImageEvt(String image) {
        this.imageEvt = image;
    }

    @Override
    public String toString() {
        return String.format("Id : %d, Nom : %s, Lieu : %s.", idEvt, nomEvt, lieuEvt);
    }
}
