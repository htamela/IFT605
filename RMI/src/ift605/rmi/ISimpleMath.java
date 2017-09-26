package ift605.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ISimpleMath extends Remote{
	public double doAdd(double x, double y) throws RemoteException;
	public double doMultiply(double x, double y) throws RemoteException;
}
