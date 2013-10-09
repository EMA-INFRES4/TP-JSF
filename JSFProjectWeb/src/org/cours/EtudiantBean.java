package org.cours;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import cours.ema.Etudiant;
import cours.ema.EtudiantFace;


@Named
public class EtudiantBean {

	@EJB
	private EtudiantFace etudiantFace;
	
	public List<Etudiant> findAllEtudiants() {
		return etudiantFace.findall();
	}
	
	public void supprimeEtudiant(Etudiant etudiant) {
		etudiantFace.Delete(etudiant);
	}
}
