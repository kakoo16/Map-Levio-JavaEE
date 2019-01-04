package Services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.map.entities.*;

@Stateless
@LocalBean

public class CommentaireService implements CommentaireServiceRemote {

	@PersistenceContext
	EntityManager em;

	@Override
	public void ajouterCommentaire(Commentaire e) {
		em.persist(e);
	}
	@Override
	public Commentaire findone(int CommentaireId) {

		return em.find(Commentaire.class, CommentaireId);
	}
	@Override
	public List<Commentaire> findAll() {

		return em.createQuery("select c from Commentaire c", Commentaire.class).getResultList();
	}

	@Override
	public void DeleteCommentaireById(int CommentaireId) {
		em.remove(em.find(Commentaire.class, CommentaireId));

	}

	@Override
	public Commentaire updatecomm(Commentaire Commentaire) {
		Commentaire = em.merge(Commentaire);
		return Commentaire;
	}

	@Override
	public String getUser(String id) {
		/*
		 * / TypedQuery<AspNetUser> query =
		 * em.createQuery("Select e from  AspNetUser e " + "where e.id=:id",
		 * AspNetUser.class ) ; query.setParameter("id", id) ; String username =
		 * null ;
		 * 
		 * try { username = query.getSingleResult() ;
		 * 
		 * }catch(NoResultException e){ System.out.println("error"); }
		 * 
		 * return username;/
		 */
		return null;
	}

	@Override
	public List<Commentaire> findAllspecial() {
		return em.createQuery("select c from Commentaire c where c.etat=True", Commentaire.class).getResultList();

	}
	@Override
	public List<Commentaire> findAllattend() {
		return em.createQuery("select c from Commentaire c where c.etat=False", Commentaire.class).getResultList();

	}

}
