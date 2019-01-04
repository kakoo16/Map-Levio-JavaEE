package tn.esprit.map.interfaces;

import java.util.List;

import javax.ejb.Local;
import javax.mail.MessagingException;

import tn.esprit.map.entities.DayOff;

@Local
public interface DayoffLocal {
    public void ajouterDayoff(DayOff d) throws MessagingException;
    public List<DayOff> getAllDayoff();
    public void supprimerDayoff(DayOff d);
    public void editDayoff(DayOff d);


}
