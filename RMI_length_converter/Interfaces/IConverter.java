package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IConverter extends Remote {
    public float cm2inch(float v) throws RemoteException;

    public float inch2cm(float v) throws RemoteException;

}
