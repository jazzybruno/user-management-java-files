package rca.ac.rw.classess;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Functionality implements rca.ac.rw.interfaces.Functionality {

    int functionality;
    public Functionality(int functionality){
        this.functionality = functionality;
    }
    @Override
    public void getUsers() {
       try {
           File  file = new File("./users.txt");
           Scanner scanner = new Scanner(file);
           while (scanner.hasNextLine()){
               String data = scanner.nextLine();
               System.out.println(data);
           }
       }catch (IOException e){
           System.out.println("The file was not found");
       }
    }
}
