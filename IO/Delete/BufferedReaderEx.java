package temp.a;

import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        //for reading the data from file
//        BufferedReader br = new BufferedReader(new FileReader("E:\\Java\\temp\\a\\new.txt"));
//        String n ="";
//
//        while(br.readLine()!=null){
//            n= br.readLine();
//            System.out.println(n);
//        }

        //from writing the data to a file
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Java\\temp\\a\\new.txt"));
        bw.write("this is inserted by using buffered writer class");
        bw.close();
    }
}
