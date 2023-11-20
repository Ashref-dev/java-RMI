package Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ConverterServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ConverterClass c = new ConverterClass();
            Naming.rebind("MonObjet", c);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
