/**
 * 
 */
package com.prime;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

/**
 * @author KIRANMAI
 *
 */
public interface PrimeChecker extends Remote {
	public Map<Integer, Boolean> primeChecker(List<Integer> randomList) throws RemoteException;

}
