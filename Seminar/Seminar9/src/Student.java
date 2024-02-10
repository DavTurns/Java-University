import java.util.List;

public class Student {

    private String name;

    private List<Pair<String,Integer>> grades;

    public List<Pair<String, Integer>> getGrades() {
        return grades;
    }

    public void setGrades(List<Pair<String, Integer>> grades) {
        this.grades = grades;
    }

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }
    public Student(String name, List<Pair<String, Integer>> grades, String university) {
        this.name = name;
        this.grades = grades;
        this.university = university;
    }

    private String university;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }


}
