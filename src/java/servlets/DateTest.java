/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Filipus
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {

        XMLGregorianCalendar xmlDate = null;
        GregorianCalendar gc = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//surround below line with try catch block as below code throws checked exception
        Date startDate = sdf.parse("1996-12-12");

        gc.setTime(startDate);
        try {
            xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Date date = xmlDate.toGregorianCalendar().getTime();
        System.out.println("Java util date = " + date);
    }
}
