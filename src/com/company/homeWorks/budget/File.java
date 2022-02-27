package com.company.homeWorks.budget;

import java.io.*;
import java.util.ArrayList;

public class File {

    public static void saveDataToCSV(ArrayList<Transaction> transactions) { //save info about all transactions with users interface
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("files/budget/transactions.csv"))) {
            bw.write("Type; ID; Date; Summ; Category; Comment");
            for (Transaction transaction : transactions) {
                if (transaction instanceof Cost) {
                    bw.write("\n Islaida ;" + transaction.toString());
                } else if (transaction instanceof Income) {
                    bw.write("\n Pajama ;" + transaction.toString());
                }
            }
        } catch (IOException e) {
            System.out.println("File 1 nerastas =(");
        }
    }

    public static void saveObjDataToFile(Budget budget) { //save Budget like object
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("files/budget/obj_data.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(budget);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static Budget readDataFromFile() { //download Budget like obj
        try {
            FileInputStream fileInputStream = new FileInputStream("files/budget/obj_data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (Budget) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }
}
