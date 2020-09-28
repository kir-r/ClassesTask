package classesTask;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String secondName;
    private String bd;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String secondName,
                   String bd, String address, String phoneNumber, String faculty,
                   int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.bd = bd;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBd() {

        return bd;
    }

    public void setBd(String bd) {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student: " + name + " " + '\n' +
                "id: " + id + '\n' +
                "surname: " + surname + '\n' +
                "name: " + name + '\n' +
                "secondName: " + secondName + '\n' +
                "birthday date: " + bd + '\n' +
                "address: " + address + '\n' +
                "phoneNumber: " + phoneNumber + '\n' +
                "faculty: " + faculty + '\n' +
                "course: " + course + '\n' +
                "group: " + group;
    }
}
