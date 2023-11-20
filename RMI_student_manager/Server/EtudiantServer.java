package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class EtudiantServer {

    public static void main(String[] args) throws Exception {
        try {
            LocateRegistry.createRegistry(1099);
            EtudiantClass c = new EtudiantClass();
            Naming.rebind("EtudiantObjet", c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}