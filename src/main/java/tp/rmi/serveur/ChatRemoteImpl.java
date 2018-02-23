package tp.rmi.serveur;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import tp.rmi.common.ChatRemote;

public class ChatRemoteImpl extends UnicastRemoteObject implements ChatRemote, Serializable {
	
	private static final long serialVersionUID = 6483015500175724528L;

	/**
	 * @throws RemoteException
	 */
	protected ChatRemoteImpl() throws RemoteException {
		super();
	}

	@Override
	public String echo(String name, String message) throws java.rmi.RemoteException {
		return name + " > " + message;
	}
} 
