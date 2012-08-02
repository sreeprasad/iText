	import java.io.*;
 
import org.xhtmlrenderer.pdf.ITextRenderer;

import com.itextpdf.text.DocumentException;

public class GenreatePDF {

 

	 
	    
	    public static void main(String[] args) 
	            throws IOException, com.lowagie.text.DocumentException {
	        String inputFile = "~/github/iText/myhtml.xhtml";
	        String url = new File(inputFile).toURI().toURL().toString();
	        String outputFile = "~/github/iText/generated.pdf";
	        OutputStream os = new FileOutputStream(outputFile);
	        
	        ITextRenderer renderer = new ITextRenderer();
	        renderer.setDocument(url);
	        renderer.layout();
	         renderer.createPDF(os);
	         
	        
	        os.close();
	    }
	}
 