package org.tsu;

public class Person {

    private String name;
    private int age;

    public Person() { }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setAgeFromString(String ageString) {
        age = Integer.valueOf(ageString);
    }

    String sayMyName(int nTimes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nTimes; i++) {
            sb.append(name + " " + age + '\n');
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Person:" + " name ='" + name + '\'' + ", age =" + age;
    }
}
