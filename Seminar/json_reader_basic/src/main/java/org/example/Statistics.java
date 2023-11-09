package org.example;

import java.util.ArrayList;
import java.util.List;

public class Statistics {

    public static List<Student> studentByUni(List<Student> students, String uni) {
        List<Student> studentsUni = new ArrayList<>();

        for(Student s: students)
            if(s.getUni().equals(uni))
                studentsUni.add(s);

        return studentsUni;

    }
}
