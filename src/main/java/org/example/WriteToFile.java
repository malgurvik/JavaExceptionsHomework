package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(PersonData data){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(data.getSurname() + ".txt", true))){
            writer.write(data.toString()+"\n");
            System.out.println("Данные успешно записаны в файл с именем " + data.getSurname());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
