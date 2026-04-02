//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        // Создаем переменные для хранения имени, отчества и фамилии
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        // Формируем полное имя в формате "Фамилия Имя Отчество"
        String fullName = lastName + " " + firstName + " " + middleName;

        // Выводим результат
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        // Задача 2: Преобразование Ф. И. О. в верхний регистр
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCaseFullName);


        // Формируем полное имя в формате "Фамилия Имя Отчество"
        String fullName1 = lastName + " " + firstName + " " + middleName;

        // Выводим результат
        System.out.println("Ф. И. О. сотрудника — " + fullName1);


        // Задача 3: Замена символа «ё» на «е»
        String fullNameWithYo = "Иванов Семён Семёнович";
        String correctedFullName = fullNameWithYo.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName);
    }
    }


