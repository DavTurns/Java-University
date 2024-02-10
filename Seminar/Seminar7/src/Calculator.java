import java.util.List;

public class Calculator {

    public static void employee_statistics(List<Employee> employees) throws InterruptedException {
        Thread maxSalaryCalculator = new MaxSalaryCalculator(employees);
        AverageCalculator averageCalculator = new AverageCalculator(employees);

        maxSalaryCalculator.start();
        averageCalculator.start();

        maxSalaryCalculator.join();

        System.out.println(((MaxSalaryCalculator) maxSalaryCalculator).getMaxSalary());
        System.out.println(averageCalculator.getAverageSalary());
    }

}
