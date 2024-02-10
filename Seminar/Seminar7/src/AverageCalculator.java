import java.util.List;

public class AverageCalculator extends Thread{

    private List<Employee> employeeList;
    private float averageSalary;

    public float getAverageSalary() {
        return averageSalary;
    }

    public AverageCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run(){

        float average = 0.0f;
        float sum = 0;
        for(Employee emp: this.employeeList) {
            sum += emp.getSalary();
        }
        this.averageSalary = sum / employeeList.size();
    }



}

