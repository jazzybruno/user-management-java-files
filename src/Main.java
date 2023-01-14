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

        Functionality functionality = new Functionality(1);
        functionality.addUser();
        functionality.getUsers();
    }
}
