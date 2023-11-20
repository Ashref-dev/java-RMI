package Client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

import Interfaces.IConverter;

public class Client {

    public static void main(String[] args) {
        IConverter ic;
        try {
            ic = (IConverter) Naming.lookup("MonObjet");
            System.out.println(" donner une valeur en cm ");
            Scanner sc = new Scanner(System.in);
            float f = sc.nextFloat();
            System.out.println(f + " cm =" + ic.cm2inch(f) + "  inch ");
            System.out.println(" donner une valeur en inch ");
            float f1 = sc.nextFloat();
            System.out.println(f1 + " inch =" + ic.inch2cm(f1) + " cm ");

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
