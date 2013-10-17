package cours.ema;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class EtudiantFace
 */
@Stateless
public class EtudiantFace {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return this.em;
	}

	public List<Etudiant> findall() {
		return  this.em.createQuery("from Etudiant").getResultList();
	}

	public void Delete(Etudiant etudiant) {
		Query query = this.em.createQuery("delete Etudiant where id = :id");
		query.setParameter("id", etudiant.getId());
		int result = query.executeUpdate();
	}

	public void createStudent(Etudiant etudiant) {
		etudiant = this.em.merge(etudiant);
		this.em.persist(etudiant);
	}

	public void updateStudent(Etudiant etudiant) {
		etudiant = this.em.merge(etudiant);
	}
	
}
