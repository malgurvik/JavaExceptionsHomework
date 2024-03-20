package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void readFromFile(){
        System.out.println("Введите имя файла без .txt:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine() + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line= reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
