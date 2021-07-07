package edu.ieu.rmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
	//ya convertimos el objeto a remoto 
	
	String say() throws RemoteException;
	//haremos la implementacion
	
}
