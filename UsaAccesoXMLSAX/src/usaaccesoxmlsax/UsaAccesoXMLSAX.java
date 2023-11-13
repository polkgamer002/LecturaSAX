/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usaaccesoxmlsax;

import java.io.File;

/**
 *
 * @author pablo
 */
public class UsaAccesoXMLSAX {

    public static void main(String[] args) {
        File f = new File("Libros.xml");
        AccesoXMLSAX a = new AccesoXMLSAX();
        a.parsearXMLconLibrosSAXhandler(f);
    }
}
