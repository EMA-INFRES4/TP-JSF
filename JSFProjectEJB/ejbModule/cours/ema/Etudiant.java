package cours.ema;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Etudiant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String specialite;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public int hashCode() {
		if (id == null) {
			return super.hashCode();
		}
		return id.intValue();
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Etudiant)) {
			return false;
		}
		Etudiant other = (Etudiant) object;
		if ( (this.id == null && other.id != null ) || (this.id != null && !this.id.equals(other.id)) ) {
			return false;
		}
		return true;
	}
}
