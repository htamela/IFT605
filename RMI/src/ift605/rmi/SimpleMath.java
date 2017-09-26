package ift605.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleMath extends UnicastRemoteObject implements ISimpleMath {

	public SimpleMath() throws RemoteException {
		super();
	}

	public double doAdd(double x, double y) throws RemoteException {
		return x + y;
	}

	public double doMultiply(double x, double y) throws RemoteException {
		return x * y;
	}
}
