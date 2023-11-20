package Interfaces;

import Models.Etudiant;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IEtudiant extends Remote {

    public String ajouterEtudiant(Etudiant e) throws RemoteException;

    public float renvoyerMoyenne(int id) throws RemoteException;

    public Etudiant rechercherMeilleur() throws RemoteException;

}
