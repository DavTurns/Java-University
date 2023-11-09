package org.example;


import java.io.IOException;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        try {


            JsonStudentParser parser = JsonStudentParser.getInstance();
            List<Student> studlist = parser.parse("data.json");

            System.out.println(studlist);

            System.out.println(Statistics.studentByUni(studlist,"UBB"));
        }
        catch (IOException ex) {
            System.out.println("File not found...");
        }
    }
}