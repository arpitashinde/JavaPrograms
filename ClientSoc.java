package temp.SocketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSoc {
    public static void main(String[] args) {
        try {
            System.out.println("this is client side");
            Socket cs = new Socket("localhost",9999);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: ");
            String str = br.readLine();
            PrintWriter pw = new PrintWriter(cs.getOutputStream(),true);
            pw.println(str);
            BufferedReader br1  = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            System.out.println(br1.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
