package tp.rmi.client;

import java.rmi.Naming;

import tp.rmi.common.ChatRemote;

public class ChatClient {
	
	public static void main(String[] args) {
        try {
            ChatRemote chat = (ChatRemote) Naming.lookup("//localhost/Chat");
            String response = chat.echo("test", "Hello World !");
            System.out.println(response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
	}

}
