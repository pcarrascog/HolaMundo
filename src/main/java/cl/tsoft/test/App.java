package cl.tsoft.test;

import java.util.UUID;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class App 
{
    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("Unique ID : " + obj.generateUniqueKey());
    }

    public String generateUniqueKey(){

    	String id = UUID.randomUUID().toString();
    	return id;
    }
    
    public void dateTimeLocal() {
    	Date date = new Date();
    	
    	//Caso 1: obtener la hora y salida por pantalla con formato:
    	DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
    	System.out.println("Hora: "+hourFormat.format(date));
    	
    }
}
