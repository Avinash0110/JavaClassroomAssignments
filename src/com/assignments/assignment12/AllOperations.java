package com.assignments.assignment12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class AllOperations {
        public static void main(String[] args) {
                ArrayList<Student> studentArrayList = new ArrayList<>();
                studentArrayList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
                studentArrayList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
                studentArrayList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
                studentArrayList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
                studentArrayList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
                studentArrayList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
                studentArrayList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
                studentArrayList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
                studentArrayList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
                studentArrayList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
                studentArrayList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
                studentArrayList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
                studentArrayList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
                studentArrayList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
                studentArrayList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
                studentArrayList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
                studentArrayList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
                //1. Print the name of all departments in the college?
                System.out.println("All Department Names:");
                studentArrayList.stream().map(student -> student.engDepartment).distinct().forEach(System.out::println);
                //2.Get the names of all students who have enrolled after 2018?
                System.out.println("the names of all students who have enrolled after 2018");
                studentArrayList.stream().filter(student -> student.yearOfEnrollment > 2018).map(student -> student.name).forEach(System.out::println);
                //3. Get the details of all male student in the computer sci department?
                System.out.println("the details of all male student in the computer sci department");
                studentArrayList.stream().filter(student -> student.gender.equals("Male")).filter(student -> student.engDepartment.equals("Computer Science")).forEach(System.out::println);
                //4.How many male and female student are there ?
                System.out.println("Number of male and female students");
                studentArrayList.stream().collect(Collectors.groupingBy(Student::getGender)).forEach((s, students) -> System.out.println(s+" Count: "+students.size()));
                //5.What is the average age of male and female students?
                System.out.println("Average Age:"+studentArrayList.stream().collect(Collectors.averagingInt(Student::getAge)));
                //6.Get the details of highest student having highest percentage ?
                System.out.println("Student with max percentage:"+studentArrayList.stream().max(Comparator.comparingDouble(Student::getPerTillDate)));
                //7.Count the number of students in each department?
                studentArrayList.stream().collect(Collectors.groupingBy(Student::getEngDepartment)).forEach((s, students) -> System.out.println(s+" Dept Count: "+students.size()));
                //8. What is the average percentage achieved in each department?
                studentArrayList.stream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPerTillDate))).forEach((s, aDouble) -> System.out.println(s+" Dept average: "+aDouble));
                //9. Get the details of youngest male student in the Electronic department?
                System.out.println("Youngest in Electronics:"+studentArrayList.stream().filter(student -> student.getEngDepartment().equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))));
                //10.How many male and female students are there in the computer science department?
                studentArrayList.stream().filter(student -> student.getEngDepartment().equals("Computer Science")).collect(Collectors.groupingBy(Student::getGender)).forEach((s, students) -> System.out.println("Computer Science "+s+" count:"+students.size()));
        }
}
