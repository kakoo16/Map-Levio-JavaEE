package ManagedBean;

import java.sql.Timestamp;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import tn.esprit.map.entities.*;
import Services.CommentaireService;

@ManagedBean
@SessionScoped
public class CommentaireBean {

	private int commentaireId;
	private String message_content;
	private Timestamp datee;
	private boolean etat;
	private String username;
	private List<Commentaire> Commentaires;

	private List<Commentaire> Commentairesspecial;

	public List<Commentaire> getCommentairesspecial() {
		return Commentairesspecial;
	}

	public void setCommentairesspecial(List<Commentaire> commentairesspecial) {
		Commentairesspecial = commentairesspecial;
	}

	@EJB
	CommentaireService CommentaireService;
	
	public void addCommentaire() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		CommentaireService.ajouterCommentaire(new Commentaire(message_content, timestamp, false,"melek"));
		this.setMessage_content("");
	}

	public void accepter(int commentaireId) {
		Commentaire Commentaire = CommentaireService.findone(commentaireId);
		this.setcommentaireId(Commentaire.getCommentaireId());
		this.setDatee(Commentaire.getDatee());
		this.setMessage_content(Commentaire.getMessage_content());
		this.setUsername(Commentaire.getUsername());
		this.setEtat(true);
		CommentaireService.updatecomm(new Commentaire(commentaireId, message_content, datee, etat, username));
		System.out.println("ok");

	}

	public void rejeter(int commentaireId) {
		CommentaireService.DeleteCommentaireById(commentaireId);
	}

	public List<Commentaire> getListCommentaire() {

		Commentaires = CommentaireService.findAll();
		return Commentaires;
	}

	public List<Commentaire> getListCommentairespecial() {

		Commentairesspecial = CommentaireService.findAllspecial();
		return Commentairesspecial;
	}

	public List<Commentaire> getListCommentaireattend() {

		Commentairesspecial = CommentaireService.findAllattend();
		return Commentairesspecial;
	}

	public String redirectList() {
		String navigateTo = "null";
		navigateTo = "/pages/admin/Commentairees?faces-redirect=true";
		return navigateTo;

	}

	public String getMessage_content() {
		return message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public CommentaireService getCommentaireService() {
		return CommentaireService;
	}

	public void setCommentaireService(CommentaireService CommentaireService) {
		this.CommentaireService = CommentaireService;
	}

	public List<Commentaire> getCommentaires() {
		return Commentaires;
	}

	public void setCommentaires(List<Commentaire> Commentaires) {
		this.Commentaires = Commentaires;
	}

	public Timestamp getDatee() {
		return datee;
	}

	public void setDatee(Timestamp datee) {
		this.datee = datee;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public int getCommentaireId() {
		return commentaireId;
	}

	public void setcommentaireId(int commentaireId) {
		this.commentaireId = commentaireId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "CommentaireBean [commentaireId=" + commentaireId + ", message_content=" + message_content + ", datee="
				+ datee + ", etat=" + etat + ", username=" + username + ", Commentaires=" + Commentaires
				+ ", CommentaireService=" + CommentaireService + "]";
	}

}
