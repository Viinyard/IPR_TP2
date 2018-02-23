package tp.rmi.common;

import java.rmi.Remote;

public interface ChatRemote extends Remote {
    public String echo(String name, String message) throws java.rmi.RemoteException;
}
