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

    public Person deleteByCode(String code){
        return this.persons.stream().filter(o -> o.getCode().equals(code)).findFirst().orElse(null);
    }

    public void salary(){
        for(Person person : persons){
            System.out.print("Salary of teacher " + person.getName() + ": ");
            System.out.println(person.getHardSalary() + person.getBonus() - person.getFine());
        } 
    }
}
