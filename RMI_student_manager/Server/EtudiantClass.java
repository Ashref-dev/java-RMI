package Server;

import Interfaces.IEtudiant;
import Models.Etudiant;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class EtudiantClass extends UnicastRemoteObject implements IEtudiant {

    private final List<Etudiant> classe;

    public EtudiantClass() throws RemoteException {
        super();
        classe = new ArrayList<>();
    }


    public String ajouterEtudiant(Etudiant e) throws RemoteException {
        classe.add(e);
        return ("Vous avez ajouté " + classe.size() + " étudiants");
    }


    public float renvoyerMoyenne(int id) throws RemoteException {
        for (Etudiant e : classe) {
            if (e.getId() == id) {
                return (e.getNote1() + e.getNote2()) / 2;
            }
        }
        return -1;
    }


    public Etudiant rechercherMeilleur() throws RemoteException {
        Etudiant meilleur = classe.get(0);
        for (Etudiant e : classe) {
            if (e.moyenne() > meilleur.moyenne()) {
                meilleur = e;
            }
        }
        return meilleur;
    }
}
