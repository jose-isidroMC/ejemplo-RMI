package edu.ieu.rmi.cliente;

import java.rmi.Naming;

import edu.ieu.rmi.servidor.HelloInterface;

public class HelloClienteRMI {

	public static void main(String[] args) {
		try {
			//hacemos un casting con (helloInterface)
		HelloInterface hello=(HelloInterface) Naming.lookup("//localhost/Hello");
		System.out.println("mensaje del rmi hello.say= "+ hello.say());	}
		 
		catch (Exception e) {
			e.printStackTrace();
		}
	}     
}
