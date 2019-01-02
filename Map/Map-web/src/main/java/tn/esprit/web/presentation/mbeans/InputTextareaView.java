package tn.esprit.web.presentation.mbeans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class InputTextareaView {
     
    public List<String> completeArea(String query) {
        List<String> results = new ArrayList<String>();
         
        if(query.equals("Hello we are having a holiday")) {
            results.add("Because it is Aid el adhha");
            results.add("Because it is Aid el kbir");
            results.add("Because it is Ramadhan.");
            results.add("Because it is 14 Janvier.");
            results.add("Because it is Ras el aam!");
        }
        else {
            for(int i = 0; i < 10; i++) {
                results.add(query + i);
            }
        }
         
        return results;
    }
}