package com.prime;

import java.rmi.Naming;


public class PrimecheckServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			  // System.setSecurityManager(new RMISecurityManager());

			   PrimeCheckerImpl pci = new PrimeCheckerImpl();			   		   
			   Naming.rebind("rmi//localhost/PRIME", pci);

			   System.out.println("PrimecheckServer is ready.");
			   }catch (Exception e) {
				   System.out.println("Addition Server failed: " + e);
				}

	}

}
