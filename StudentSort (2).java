package demo01;

import java.util.Arrays;
import java.util.Comparator;

public class StudentSort {
    public static void insertSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student k = students[i];
            int j = i - 1;
            for (; j >= 0 && ((Comparable<Student>) students[j]).compareTo(k) > 0; j--) {
                students[j + 1] = students[j];
            }
            students[j + 1] = k;
        }
    }

    public static void inserSort(Student[] students, Comparator<Student> cmp) {
        for (int i = 1; i < students.length; i++) {
            Student k = students[i];
            int j = i - 1;
            for (; j > 0 && cmp.compare(students[j], k) > 0; j--) {
                students[j + 1] = students[j];
            }
            students[j + 1] = k;
        }
    }

    public static class Cmp implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Student[] students = {new Student(),new Student(),new Student()};
        Arrays.sort(students,new Cmp());
    }
}
