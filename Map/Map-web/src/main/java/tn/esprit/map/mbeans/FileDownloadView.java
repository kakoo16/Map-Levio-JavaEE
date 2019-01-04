package tn.esprit.map.mbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.omg.CORBA.portable.InputStream;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean
public class FileDownloadView {
	 private StreamedContent file;
     
	    public FileDownloadView() {        
	        InputStream stream = (InputStream) FacesContext.getCurrentInstance().getExternalContext().getResourceAsStream("/resources/demo/images/boromir.jpg");
	        file = new DefaultStreamedContent(stream, "image/jpg", "downloaded_boromir.pdf");
	    }
	 
	    public StreamedContent getFile() {
	        return file;
	    }

}
