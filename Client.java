package it.fi.meucci;

import java.io.*;
import java.net.*;


public class ClientStr {
    String nomeServer ="localhost";                          // indirizzo server locale
    int portaServer = 6789;                                 // porta x servizio data e ora
    Socket miosocket;
    BufferedReader tastiera;
    String stringaUtente;
    String stringaRicevutaDalServer;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;

    public Socket connetti(){
        System.out.println ("2 CLIENT partito in esecuzione ...");
        try{
            // per l'input da tastiera 
            tastiera = new BufferedReader(new InputStreamReader(System.in));
            // creo un socket
            miosocket = new Socket (nomeServer, portaServer);
            outVersoServer = new DataOutputStream (miosocket.getOutputStream());
            inDalServer = new BufferedReader(new InputStreamReader(miosocket.getInputStream()));

        }
        catch (UnknownHostException e){
            System.err.println("Host sconosciuto");

        }
        catch (Exception e){
            System.out.println (e.getMessage());
            System.out.println ("Errore durante la connessione !");
            System.exit(1);
        }
        return miosocket;

    }
}