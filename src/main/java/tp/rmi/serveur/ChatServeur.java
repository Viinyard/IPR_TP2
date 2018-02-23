package tp.rmi.serveur;

import java.net.UnknownHostException;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import tp.rmi.common.ChatRemote;

public class ChatServeur {

	public ChatServeur() {

	}

	public static void main(String[] args) {
		
		try {
			ChatRemoteImpl chatRemote = new ChatRemoteImpl();
			
			//ChatRemote stub = (ChatRemote) UnicastRemoteObject.exportObject(chatRemote, 0);
			String url = "//" + InetAddress.getLocalHost().getHostAddress() + "/Chat";
			System.out.println(url);
            // Bind the remote object's stub in the registry
            Naming.bind(url, chatRemote);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();	
		}
		
		System.err.println("Ok");
		
	}

}
