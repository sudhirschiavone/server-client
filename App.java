package it.fi.itismeucci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ServerStr servente= new ServerStr();
        for (;;) {
            servente.attendi();
            servente.comunica();    
        }
    }
}