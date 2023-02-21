package temp.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOCode {
    public static void main(String[] args) throws IOException {
       // File file = new File("Hey.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
////to write in file
//        FileWriter f = new FileWriter("Hey.txt");
//        f.write("adding this string to the file");

        //for reading a file
        File myFile = new File("Hey.txt");
        try {
            Scanner in = new Scanner(myFile);
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//to delete a file
        if(myFile.delete()){
            System.out.println("FIle deleted successfully: " + myFile.getName());
        }
        else{
            System.out.println("cannot delete the file");
        }



    }
}
