package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные о пользователе (через пробел) в формате: " +
                "Фамилия Имя Отчество дата_рождения (dd.mm.yyyy) номер_телефона пол (m/f)");
        String input = scanner.nextLine();

        try {
            PersonData personData = DataValidate.validData(input);
            System.out.println(personData);
            WriteToFile.writeToFile(personData);

        } catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
//        ReadFromFile.readFromFile();
    }
}
