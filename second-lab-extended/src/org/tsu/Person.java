package org.tsu;

public class Person {
    private String name;
    private int age;

    public Person() { }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAgeFromString(String ageString) {
        this.age = Integer.valueOf(ageString);
    }

    public String sayMyName(int nTimes) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nTimes; i++) {
            sb.append(i + 1 + ") " + name + "\n");
        }

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", age=" + age + '\n';
    }
}
