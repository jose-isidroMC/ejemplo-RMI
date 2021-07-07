package edu.ieu.rmi.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloRegistryServer {
	//creamos el registro 
	
	public static void main(String [] args ) {
		try {
			//para crear el registro utilizamos la clase que esta aqui
	         Registry registry= LocateRegistry.createRegistry(1099);
	         registry.rebind("Hello", new HelloImp("Olaaaaaaaa"));
	         System.out.println("servidor conectado ,listo para operar");
		} catch (Exception ex) {
			System.out.println("Servidor no conectado");
			
		}
	}

}
