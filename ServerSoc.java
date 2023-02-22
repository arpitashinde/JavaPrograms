package temp.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {
    public static void main(String[] args) {
        try {
            System.out.println("this is server side");
            ServerSocket ss = new ServerSocket(9999);
            Socket soc = ss.accept();
            System.out.println("connnection established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str = in.readLine();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Msg from Server: "+str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
