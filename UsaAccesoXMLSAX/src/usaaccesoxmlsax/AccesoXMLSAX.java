/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usaaccesoxmlsax;

/**
 *
 * @author pablo
 */
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class AccesoXMLSAX {
    //Crea una variable tipo SAXParser llamada parser
    SAXParser parser;

    public int parsearXMLconLibrosSAXhandler(File f) {
        try {
            //Crea una nueva instancia SAXParserFactory que hace instancias SAXParser
            SAXParserFactory factory = SAXParserFactory.newInstance();
            parser = factory.newSAXParser();
            //Crea una nueva instancia LibrosSAXhandler la cual es la otra 
            //clase para manejar los eventos SAX
            LibrosSAXhandler sh = new LibrosSAXhandler();
            parser.parse(f, sh);
            return 0;//Si el parser funciona
        } catch (Exception e) {
            e.printStackTrace();
            return -1;//Si el parser falla
        }
    }
}

