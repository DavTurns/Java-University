package ex1;

public class Grades {

    public int[] dissatisfyingGrades(int[] grade) {
        /*
         * input: array of grades: int[]
         * output: array of rounded dissatisfying grades( < 38): int[]
         * */
        int[] finalGrades = new int[0];

        for (int i = 0; i < grade.length; i++) {
            if (round(grade[i]) < 40) {
                finalGrades = addToArray(finalGrades, round(grade[i]));
            }
        }
        return finalGrades;
    }

    public int round(int grade) {
        //helper function
        if (grade < 38) {
            return grade;
        } else {

            if (grade % 5 > 2) {
                return grade + 5 - grade % 5;
            } else {
                return grade;
            }
        }
    }

    public int[] addToArray(int[] original, int newElement) {
        //helperfunction
        int[] result = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }
        result[original.length] = newElement;
        return result;
    }

    public int[] convertToRoundedGrades(int[] grades) {

        for (int i = 0; i < grades.length; i++) {
            grades[i] = round(grades[i]);
        }
        return grades;
    }

    public int getAverage(int[] grades) {

        if (grades.length == 0) {
            //exception
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += round(grades[i]);
        }
        return sum / grades.length;

    }

    public int getMaxroundedGrade(int[] grades) {

        grades = convertToRoundedGrades(grades);

        int maxGrade = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade) maxGrade = grades[i];
        }
        return maxGrade;
    }


}

