import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lesson5 {
    public static int COUNT_EMPLOYEE = 5;

    public static Scanner sc = new Scanner(System.in);

    public static boolean isStringValid(String s) {
        return s.length() != 0;
    }

    public static boolean isDoubleValid(Double d) {
        return d >= 0;
    }

    public static boolean isIntValid(int y) {
        return y > 0;
    }

    public static boolean isEmailValid(String s) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (s == null)
            return false;
        return pat.matcher(s).matches();
    }

    public static void main(String[] args) {
        System.out.println("Задание 1-3");
        homeTaskOne();
        System.out.println();
        System.out.println("Задание 4");
        do {
            System.out.print("Введите количество сотрудников:");
            COUNT_EMPLOYEE = sc.nextInt();
        } while (COUNT_EMPLOYEE <= 0);

        Employee[] personArray = new Employee[COUNT_EMPLOYEE];
        homeTaskFour(personArray);
        System.out.println();
        System.out.println("Задание 5");
        homeTaskFive(personArray);

    }

    public static void homeTaskOne() {
        Employee employee = new Employee("lastName",
                "firstName",
                "patronymic",
                "position",
                "email",
                "phoneNumber",
                100000.00,
                63);
        employee.employeePrint();


    }

    public static void homeTaskFour(Employee[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            personArray[i] = new Employee();
            System.out.println("Введите данные сотрудника под номером: " + (i + 1));
            do {
                System.out.print("Введите фамилию:");
                sc.nextLine();
                personArray[i].setLastName(sc.nextLine());

            } while (!isStringValid(personArray[i].getLastName()));

            do {
                System.out.print("Введите имя:");
                personArray[i].setFirstName(sc.nextLine());
            } while (!isStringValid(personArray[i].getFirstName()));

            do {
                System.out.print("Введите отчество:");
                personArray[i].setPatronymic(sc.nextLine());
            } while (!isStringValid(personArray[i].getPatronymic()));
            do {
                System.out.print("Введите возраст:");
                personArray[i].setAge(sc.nextInt());
            } while (!isIntValid(personArray[i].getAge()));
            do {
                System.out.print("Введите должность:");
                sc.nextLine();
                personArray[i].setPosition(sc.nextLine());
            } while (!isStringValid(personArray[i].getPosition()));
            do {
                System.out.print("Введите Email:");
                personArray[i].setEmail(sc.nextLine());
            } while (!isEmailValid(personArray[i].getEmail()));
            do {
                System.out.print("Введите номер телефона:");
                personArray[i].setPhoneNumber(sc.nextLine());
            } while (!isStringValid(personArray[i].getPhoneNumber()));
            do {
                System.out.print("Введите размер заработной платы:");
                personArray[i].setSalary(sc.nextDouble());
            } while (!isDoubleValid(personArray[i].getSalary()));

        }


    }

    public static void homeTaskFive(Employee[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() >= 40) {
                personArray[i].employeePrint();

            }

        }
    }
}
