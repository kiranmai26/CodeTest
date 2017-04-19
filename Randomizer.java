package com.random;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.lang.model.type.PrimitiveType;

import com.prime.PrimeChecker;

public class Randomizer {

	/**
	 * @param args
	 */
	
	public Integer randomList(){
		
		Random randomList=new Random();
		Integer genNum=randomList.nextInt();
		System.out.println(randomList.nextInt());
		if(genNum<0){
			randomList();
		}
		
		return genNum;
	}
	
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		
		Randomizer rand=new Randomizer();
		PrimeChecker look_up=null;
		List<Integer> posNumList=new ArrayList<>();
		for (int i=0;i<3;i++){
		Integer num=rand.randomList();
		if(num>0){
		posNumList.add(num);
				}
		look_up = (PrimeChecker) Naming.lookup("//localhost/PRIME");
		System.out.println(posNumList);
		
		Map<Integer, Boolean> primeList=look_up.primeChecker(posNumList);
		System.out.println(primeList);
	}
	}
}
