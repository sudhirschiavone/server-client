package it.fi.itismeucci;

/**
 * Hello world!
 *
 */
public class Appclient
{
    public static void main( String[] args )
    {
        ClientStr cliente= new ClientStr();
        cliente.connetti();
        cliente.comunica();
    }
}
