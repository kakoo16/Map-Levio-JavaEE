package tn.esprit.map.interfaces;

import java.util.List;

import javax.ejb.Remote;
import javax.mail.MessagingException;

import tn.esprit.map.entities.DayOff;

@Remote
public interface DayoffRemote {
    public void ajouterDayoff(DayOff d) throws MessagingException;
    public List<DayOff> getAllDayoff();
    public void supprimerDayoff(DayOff d);
    public void editDayoff(DayOff d);


}
