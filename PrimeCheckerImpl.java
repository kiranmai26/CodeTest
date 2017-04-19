package com.prime;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class PrimeCheckerImpl extends UnicastRemoteObject implements PrimeChecker{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	PrimeCheckerImpl() throws RemoteException{
		super();
	}
	
	public Map<Integer, Boolean> primeChecker(List<Integer> randList) throws RemoteException{
		int i,m=0,flag=0;    
		Map<Integer,Boolean> primeCheckMap=new HashMap<>();
		Iterator<Integer> itrList= randList.iterator();
		if(itrList.hasNext()){
			int randNum=itrList.next();
		  m=randNum/2;    
		  for(i=2;i<=m;i++){    
		   if(randNum%i==0){    
		   System.out.println("Number is not prime");    
		   flag=1; 
		   primeCheckMap.put(randNum, false);
		   break;    
		   }    
		  }    
		  if(flag==0)    
		  System.out.println("Number is prime"); 
		  primeCheckMap.put(randNum, true);
		}	    		
		return primeCheckMap;
	}

		
}
