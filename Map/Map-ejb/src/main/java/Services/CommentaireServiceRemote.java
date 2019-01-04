package Services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.map.entities.*;

@Remote

public interface CommentaireServiceRemote {
	public void ajouterCommentaire(Commentaire e);

	public List<Commentaire> findAll();


	public List<Commentaire> findAllspecial();

	public void DeleteCommentaireById(int CommentaireId);

	public Commentaire updatecomm(Commentaire Commentaire);

	public String getUser(String id);
	public List<Commentaire> findAllattend();
	public Commentaire findone(int CommentaireId);
	
}
