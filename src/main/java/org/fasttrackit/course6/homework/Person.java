package org.fasttrackit.course6.homework;

public class Person {
    private String name;
    private String age;
    private boolean marriedStatus;

    public Person() {

    }

    public Person(String name, String age, boolean marriedStatus) {
        this.name = name;
        this.age = age;
        this.marriedStatus = marriedStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean getMarriedStatus() {
        return marriedStatus;
    }

    public void setMarriedStatus(boolean marriedStatus) {
        this.marriedStatus = marriedStatus;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marriedStatus=" + marriedStatus +
                '}';
    }
}
