
package usaaccesoxmlsax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

public class LibrosSAXhandler extends DefaultHandler {
    //inicializamos la variable contadorlibros para 
    //llevar a cabo la cuenta de libros y el constructor
    private int contadorlibros=0;
    public LibrosSAXhandler() {
    }
    
    //Sobreescribimos el metodo startelement para cuando 
    //el parser empieza a procesar un elemento del xml
    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        //comprueba si el elemento actual es el libros y muestra el encabezado de ser asi    
        if (qName.equals("Libros")){
            System.out.println("Listado de libros:");
            System.out.println("-----------------------");
        }
        //comprueba si el elemento actual es libro y aumenta el contador de ser asi 
        else if (qName.equals("Libro")) {
            contadorlibros++;
            //muestra el nº de libro que es y el año de publicacion
            System.out.println("Libro "+contadorlibros);
            System.out.println("Publicado en: " + atts.getValue(atts.getQName(0)));
        //comprueba si el elemento actual es titulo y muestra el titulo    
        } else if (qName.equals("Titulo")) {
            System.out.print("\n " + "El titulo es: ");
        } 
        //comprueba si el elemento actual es autor y muestra el autor
        if (qName.equals("Autor")) {
            System.out.print( "El autor es: ");
        }
    }
    //sobreescribe el elemento endelement para cuando el parser acaba de procesar el xml
    @Override
    public void endElement(String uri, String localName, String qName) throws
            SAXException {
        //comprueba si el elemento final es libro y muestra una linea divisoria 
        //para poder ver cada libro separado
        if (qName.equals("Libro")) {
            System.out.println("\n-----------------------");
        }
    }
    //sobreescribe el elemento characters para poder cambiar los caracteres individuales
    @Override
    public void characters(char[] ch, int start, int length) throws
            SAXException {

        String car = new String(ch, start, length);
        //cambia los tabuladores y los saltos de linea por espacios
        car = car.replaceAll("\t", " ");
        car = car.replaceAll("\n", " ");
        //imprime el contenido de texto, que es el titulo o el autor
        System.out.print(car);
    }
}
