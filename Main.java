import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManageTeacher manageTeacher = new ManageTeacher();
        while (true) {
            System.out.println("--------------------------choose request---------------------------");
            System.out.println("Enter 1: To add teacher.");
            System.out.println("Enter 2: To delete teacher.");
            System.out.println("Enter 3: To show salary.");
            System.out.println("Enter 4: To exit.");
            System.out.print("Choose command: "); String choose = scanner.nextLine();
            switch (choose) {
                case "1":{
                    System.out.println("--------------------------enter information of teacher---------------------------");
                    System.out.print("Name: "); String name = scanner.nextLine();
                    System.out.print("Age: "); int age = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Home town: "); String homeTown = scanner.nextLine();
                    System.out.print("Code: "); String code = scanner.nextLine();
                    System.out.print("Hard salary: "); int hardSalary = scanner.nextInt();
                    System.out.print("Bonus: "); int bonus = scanner.nextInt();
                    System.out.print("Fine: "); int fine = scanner.nextInt(); scanner.nextLine();
                    Person person = new Person(name, age, homeTown, code, hardSalary, bonus, fine);
                    manageTeacher.addTeacher(person);
                    System.out.println("information you have just entered.");
                    person.toString();
                    System.out.println("--------------------------------------------");
                    break;
                }
                case "2":{
                    System.out.print("Enter code of teacher want to delete: "); String code = scanner.nextLine();
                    System.out.println(manageTeacher.deleteByCode(code).toString());
                    if(manageTeacher.deleteByCode(code) == null) System.out.println("There are no the value code at this list teacher.");
                }
                case "3":{
                    System.out.println("Salary each teacher: ");
                    manageTeacher.salary();
                    break;
                }
                case "4":{
                    scanner.close();
                    return;
                }
                default:
                System.out.println("Invalid.");
                    break;
            }
        }
    }
}
