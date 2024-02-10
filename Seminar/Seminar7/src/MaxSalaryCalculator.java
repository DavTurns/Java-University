import java.util.List;

public class MaxSalaryCalculator extends Thread{

    private List<Employee> employeeList;
    private int maxSalary;


    public MaxSalaryCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    @Override
    public void run(){

        int max = 0;
        for(Employee emp: this.employeeList) {
            if (emp.getSalary() > max) max = emp.getSalary();
        }
        this.maxSalary = max;
    }



}
