package org.example;

public class DataValidate {
    public static PersonData validData(String input) throws InvalidDataException {
        String[] data = input.split(" ");

        if (data.length != 6)
            throw new InvalidDataException("Введено не верное количество данных.");

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String dateOfBirth = data[3];
        String phoneNumber = data[4];
        String gender = data[5];

        if (!surname.matches("[a-zA-Zа-яА-Я\\-]+") ||
                !name.matches("[a-zA-Zа-яА-Я\\-]+") ||
                !patronymic.matches("[a-zA-Zа-яА-Я\\-]+")) {
            throw new InvalidDataException("Введены некорректные данные. Фамилия,Имя и Отчество " +
                    "должны состоять только из букв. Если отчество отсутствует необходимо поставить тире.");
        }
        if (!dateOfBirth.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new InvalidDataException("Некорректный формат даты рождения. Введите дату в формате dd.mm.yyyy.");
        }
        if (!phoneNumber.matches("[0-9]+") || phoneNumber.length() != 11) {
            throw new InvalidDataException("Некорректный формат номера телефона. Номер должен состоять только из" +
                    "цифр в формате 88001112233");
        }
        if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
            throw new InvalidDataException("Неверный формат пола. " +
                    "Введите 'm' для мужчин и 'f' для женщин");
        }


        return new PersonData(surname, name, patronymic, dateOfBirth, phoneNumber, gender);
    }
}
