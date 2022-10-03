package it.fi.itismeucci;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ClientStr cliente= new ClientStr();
        cliente.connetti();
        cliente.comunica();
    }
}
