package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import Interfaces.IConverter;

public class ConverterClass extends UnicastRemoteObject implements IConverter {
    public ConverterClass() throws RemoteException {
        super();
    }

    public float cm2inch(float v) throws RemoteException {
        return (float) (v / 2.54);
    }

    public float inch2cm(float v) throws RemoteException {
        return (float) (v * 2.54);
    }
}
