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
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> field = new ArrayList<String>();
            FileWriter fileWriter = new FileWriter("./users.txt");
            System.out.println("Okay welcome to the user addition!! ");
            System.out.println("Please fill out the following data to save a user");
            String fields[] = {"id" , "firstName" , "secondName" , "age" ,"email" , "telephone" , "fatherName" , "motherName"};
           for (int i=0; i < fields.length; i++){
               System.out.println(fields[i] + ": ");
               String input = scanner.nextLine();
               field.add(input);
           }

           fileWriter.write("\t\tNew User");
            for (int i = 0; i < field.size(); i++) {
               fileWriter.write("User Data: " + field.get(i) + "\n");
            }
            fileWriter.write(" ");
            fileWriter.close();

        }catch (IOException e){
            System.out.println("The file does not exist");
        }

    }
}
