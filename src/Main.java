import rca.ac.rw.classess.Functionality;
import rca.ac.rw.interfaces.Introduction;
import rca.ac.rw.classess.*;
import rca.ac.rw.interfaces.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Introduction introduction = new rca.ac.rw.classess.Introduction();
        String action = introduction.introduction();
        try {
            FileWriter fileWriter = new FileWriter("./users.txt");
            for (int i = 0; i < 200; i++){
                fileWriter.write("The current index is now: " + i  +"\n");
            }
            fileWriter.close();
        }catch (IOException e){
            System.out.println(
                    "The file was not found"
            );
        }
        Functionality functionality = new Functionality(1);
        functionality.getUsers();
    }
}
