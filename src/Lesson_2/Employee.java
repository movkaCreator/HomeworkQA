package Lesson_2;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Хашаев Мовлади Алиевич", "QA Engineer", "khashaev@mail.com", "89231231212", 50000, 25);
        employees[1] = new Employee("Петров Петр Петрович", "Manager", "petrov@mail.com", "89231231312", 35000, 35);
        employees[2] = new Employee("Сидоров Сидр Сидорович", "Developer", "sidorov@mail.com", "89231231414", 40000, 40);
        employees[3] = new Employee("Марков Марк Маркович", "Designer", "smirnov@mail.com", "89231231515", 45000, 25);
        employees[4] = new Employee("Колесников Владимир Владимирович", "Analyst", "kuznetsova@mail.com", "89231231616", 50000, 28);

        for (Employee employee : employees) {
            employee.printInfo();
            System.out.println("--------------------------");
        }
    }
}