package rca.ac.rw.classess;

import java.util.ArrayList;
import java.util.Scanner;

public class Introduction  implements rca.ac.rw.interfaces.Introduction {
    @Override
    public String introduction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println(" \t Welcome to my User Management System: Genzura!!");
        System.out.println("\n These are the function you can perform: ");
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("Read User");
        actions.add("Update User");
        actions.add("Delete User" );
        actions.add("Add User");

        for (int i =0; i < actions.size(); i++){
            int number = i+1;
            System.out.println(number + " " + actions.get(i ));
        }

        System.out.println("\n Please enter the number of the action you want to perform: ");

        int number = scanner.nextInt();
        int index = number - 1;
        String action = actions.get(index);
        System.out.println("You have chosen the " + action + " action");
        return action;
    }
}
