package rca.ac.rw.classess;

import java.io.File;
import java.io.FileWriter;
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

    public void addUser(){
        try {
            FileWriter fileWriter = new FileWriter("./users.txt");
            System.out.println("Okay welcome to the user addition!! ");
            System.out.println("Please fill out the following data ro save a user");

        }catch (IOException e){
            System.out.println("The file does not exist");
        }

    }
}
