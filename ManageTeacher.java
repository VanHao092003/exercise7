import java.util.ArrayList;
import java.util.List;

public class ManageTeacher {
    private List<Person> persons;

    public ManageTeacher(){
        this.persons = new ArrayList<>();
    }

    public void addTeacher(Person person){
        this.persons.add(person);
    }

    public void deleteByCode(String code){
        Person person =  this.persons.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
        if(person != null){
            System.out.println(person.toString());
            persons.remove(person);
        }
        else {
            System.out.println("There are no the value of code at this list.");
        }
    }

    public void salary(){
        for(Person person : persons){
            System.out.print("Salary of teacher " + person.getName() + ": ");
            System.out.println(person.getHardSalary() + person.getBonus() - person.getFine());
        } 
    }
}
