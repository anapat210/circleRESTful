/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circlerestfulclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleClient;

/**
 *
 * @author anapat
 */
public class CircleRestfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircleClient client = new CircleClient();
        String xml = client.getXml("5");
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Area : " + res.getArea());
        System.out.println("Circumference : " + res.getCircumference());
    }
    
}
