package it.fi.itismeucci;

public class Appclient{
    public static void main( String[] args )
    {
        ClientStr cliente= new ClientStr();
        cliente.connetti();
        cliente.comunica();
    }
}
