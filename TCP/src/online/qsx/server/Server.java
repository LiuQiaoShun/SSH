package online.qsx.server;

import online.qsx.message.Message;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<User>list=new ArrayList<User>();
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(10001);
        while (true){
            Socket socket=serverSocket.accept();
            User user=new User(socket);
            new Thread(user).start();
            Server.list.add(user);
        }
    }
}

class User implements Runnable{
    private Socket socket;

    public User(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true){
            Message message;
            try {
                message=(Message)new ObjectInputStream(socket.getInputStream()).readObject();

            }catch (Exception e){
               continue;
            }
            for (User temp:Server.list){
                try {
                    new ObjectOutputStream(temp.socket.getOutputStream()).writeObject(message);

                }catch (Exception e){
                    continue;
                }
            }
        }
    }
}