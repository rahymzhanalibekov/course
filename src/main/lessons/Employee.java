public class Employee {
    private String firstName;
    private String lastName;
    private String patronymic;
    private String position;
    private String email;
    private String phoneNumber;
    private Double salary;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
        public Employee(){
            this.setLastName("");
            this.setFirstName("");
            this.setPatronymic("");
            this.setPosition("");
            this.setEmail("");
            this.setPhoneNumber("");
            this.setSalary(0.00);
            this.setAge(0);

        }
    public Employee(String lastName, String firstName, String patronymic, String position, String email, String phoneNumber, Double salary, int age) {
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setPatronymic(patronymic);
        this.setPosition(position);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setSalary(salary);
        this.setAge(age);
    }

    public void employeePrint() {
        System.out.println("********************");
        System.out.println("Ф.И.О.: " + this.getLastName() + " " + this.getFirstName() + " " + this.getPatronymic());
        System.out.println("Возвраст: " + this.getAge());
        System.out.println("Должность: " + this.getPosition());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Номер телефона: " + this.getPhoneNumber());
        System.out.println("Заработная плата: " + this.getSalary());


    }

}
