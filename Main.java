package classesTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Создать массив объектов. Вывести:
a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса;
c) список студентов, родившихся после заданного года;
d) список учебной группы.*/

public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws ParseException, IOException {
        Student agnetha = new Student(1, "Löfgren", "Agnetha",
                "Ose", "02-12-1990", "Stockholm",
                "+46 853733824", "Faculty of Magic",
                2, "qmn23");
        Student bjorn = new Student(2, "Sjöberg", "Bjorn", "Jon",
                "01-11-1989", "Stockholm", "+46 856733824",
                "Faculty of Lyric", 3, "qmn23");
        Student benny = new Student(2, "Bergman", "Benny", "Ben",
                "03-05-1988", "Stockholm", "+46 856733123",
                "Faculty of Music", 3, "rtm51");
        Student frida = new Student(2, "Engström", "Frida", "Ola",
                "05-07-1989", "Oslo", "+46 756733123",
                "Faculty of Dancing", 3, "rtm51");

        ArrayList<Student> list = new ArrayList<>();
        list.add(agnetha);
        list.add(bjorn);
        list.add(benny);
        list.add(frida);

        for (Student student : list) {
            DataFormat(student);
            hashID(student);
        }

        getByFaculty(list);
        getByYear(list);
        getByGroup(list);
        cleanUp();

        // write your code here
    }

    public static void DataFormat(Student student) throws ParseException {
        SimpleDateFormat dateParse = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        Date date = dateParse.parse(student.getBd());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        student.setBd(dateFormat.format(date));
    }

    public static void hashID(Student student) {
        student.setId(student.hashCode());
    }

    public static void getByFaculty(ArrayList<Student> list) throws IOException {
        System.out.println("You're searching by a faculty. Please type a faculty below:");
        String faculty;
        HashSet<Student> set = new HashSet<>();
        while (true) {
            faculty = reader.readLine();
            for (Student student : list) {
                if (student.getFaculty().equals(faculty)) {
                    set.add(student);
                }
            }
            if (set.isEmpty()) {
                System.out.println("There's no such a faculty");
            } else {
                for (Student student : set) {
                    System.out.println(student.getName() + " " + student.getSurname() + ", id: " + student.getId());
                }
                System.out.println();
                break;
            }
        }
    }

    public static void getByYear(ArrayList<Student> list) throws IOException {
        System.out.println("You're searching a students younger than a given year of birthday. Please type a year below:");
        String year;
        HashSet<Student> set = new HashSet<>();
        while (true) {
            year = reader.readLine();
            try {
                for (Student student : list) {
                    if ((Integer.parseInt(year)) < Integer.parseInt(student.getBd().substring(6))) {
                        set.add(student);
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("You've typed a letter, not a date");
                break;
            }
            if (set.isEmpty()) {
                System.out.println("There's no such a student");
            } else {
                for (Student student : set) {
                    System.out.println(student.getName() + " " + student.getSurname() + ", birthday date: " + student.getBd());
                }
                System.out.println();
                break;
            }
        }
    }

    public static void getByGroup(ArrayList<Student> list) throws IOException {
        System.out.println("You're searching a students by a group. Please type a group below:");
        String group;
        HashSet<Student> set = new HashSet<>();
        while (true) {
            group = reader.readLine();
            for (Student student : list) {
                if (student.getGroup().equals(group)) {
                    set.add(student);
                }
            }
            if (set.isEmpty()) {
                System.out.println("There's no students is this group");
            } else {
                for (Student student : set) {
                    System.out.println(student.getName() + " " + student.getSurname() + ", group: " + student.getGroup());
                }
                System.out.println();
                break;
            }
        }
    }

    public static void cleanUp() throws IOException {
        reader.close();
    }
}
