import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5);
        List<Integer> perfectNumbers = List.of(6,28,496,7,5,1);
        System.out.println("sumOddNumbers(numbers): ");
        System.out.println(sumOddNumbers(numbers));

        System.out.println("productPowerNumbers(numbers): ");
        System.out.println(productPowerNumbers(numbers));


        System.out.println("maximumPerfectNumbers(perfectNumbers): ");
        System.out.println(maximumPerfectNumbers(perfectNumbers));

        List<Pair<Student, Integer>> studentGrades = List.of(
                new Pair<>(new Student("Bob", "UBB"), 9),
                new Pair<>(new Student("Dob", "UBB"), 7),
                new Pair<>(new Student("Lob", "UBB"), 5),
                new Pair<>(new Student("Mob", "UBB"), 6)
        );

        System.out.println(studentMaxGradeMyVersion(studentGrades));
        studentMaxGrade(studentGrades);

        List<Student> students = List.of(
                new Student("Bob","UBB"),
                new Student("Max","UBB"),
                new Student("Dob","UT"),
                new Student("Bax","UT"),
                new Student("Dax","UT")
        );
        System.out.println(countStudentsByUni(students));

        List<Student> studentsWithGrades = List.of(
                new Student("Bob",List.of(new Pair<>("mate",5)),"UBB"),
                new Student("Max",List.of(new Pair<>("algebra",8)),"UBB"),
                new Student("Dob",List.of(new Pair<>("mate",9)),"UT"),
                new Student("Bax",List.of(new Pair<>("mate",8)),"UT"),
                new Student("Dax",List.of(new Pair<>("algebra",3)),"UT")
        );

        System.out.println(getCoursesAverage(studentsWithGrades));
    }



    public static int sumOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num%2 != 0)
                //.mapToInt(Integer::intValue)
                .mapToInt(n -> Integer.valueOf(n))
                .sum();
    }

    public static int productPowerNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .reduce(1,(a,b) -> a * b);
    }

    public static int maximumPerfectNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> (num == IntStream
                        .rangeClosed(1, num/2)
                        .filter(div -> num % div == 0).sum()))
                .max(Integer::compareTo)
                .orElse(-1);
    }

    public static Pair<Student, Integer> studentMaxGradeMyVersion(List<Pair<Student, Integer>> students) {
        //Das ist falsch weil wenn mehrere studenten die beste note haben wird trotzedem nur einer zurückgegeben
        return students.stream()
                .max((studentGrade,studentGrade2) -> (studentGrade.getSecond() - studentGrade2.getSecond()))
                .orElse(new Pair<Student, Integer>(new Student("No", "Student"), -1));
    }

    public static void studentMaxGrade(List<Pair<Student, Integer>> grades){
        System.out.println(grades.stream()
                .filter(studentGrade -> studentGrade.getSecond()==grades.stream()
                        .map(Pair::getSecond)
                        .max(Integer::compareTo).orElse(-1)).toList()

        );

        //varianta 2, sa facem mai intai nota maxima si dupa sa gasim studentu:
        int maxGrade =  grades.stream().map(Pair::getSecond)
                .max(Integer::compareTo).orElse(-1);

        System.out.println(
                grades.stream().filter(entry -> entry.getSecond() == maxGrade)
                        .map(Pair::getFirst).toList()
        );
    }

    public static Map<String, Long> countStudentsByUni (List<Student> students){
        return students
                .stream()
                .collect(Collectors.groupingBy(Student::getUniversity, Collectors.counting()));

    }

    public static Map<String, Double> getCoursesAverage(List<Student> students){
        return students
                .stream()
                .flatMap(student -> student.getGrades().stream())
                .collect(Collectors.groupingBy(Pair::getFirst, Collectors.averagingDouble(Pair::getSecond)));

    }
}