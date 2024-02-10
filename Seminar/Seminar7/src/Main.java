import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Employee> employees = List.of(
                new Employee("Bob", 1200),
                new Employee("Dob", 1400),
                new Employee("Lob", 900)
        );
        try{
            Calculator.employee_statistics(employees);
        } catch(InterruptedException ex) {
            System.out.printf(ex.getMessage());
        }

        List<Integer> numbers = List.of(1,2,3,1,2,3,1,2,3);
        Statistics s = new Statistics(numbers);

        s.statsCompute();


    }
}