package org.tsu;

public class Employee {
    public class Statistic {

        private final Employee employee;
        public Statistic(Employee employee) {
            this.employee = employee;
        }
        boolean hasMoreThanTheAverage() {
            return employee.getMonthlySalary() > employee.getProfession().getAverageSalary();
        }
        double getYearlySalary() {
            return employee.getMonthlySalary() * 12;
        }
    }

    public enum Profession {
        PROGRAMMER(600.00),
        ENGINEER(700.00),
        MANAGER(800.00);
        private final double averageSalary;
        Profession(double averageSalary) {
            this.averageSalary = averageSalary;
        }
        public double getAverageSalary() {
            return averageSalary;
        }
    }
    public enum Gender {
        MALE,
        FEMALE,
    }

    final private String name;
    private Profession profession;
    private double monthlySalary;
    private Gender gender;

    public Employee(String name, Profession profession, double monthlySalary, Gender gender) {
        this.name = name;
        this.profession = profession;
        this.monthlySalary = monthlySalary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", profession=" + profession +
                ", monthlySalary=" + monthlySalary +
                ", gender=" + gender +
                '}';
    }
}
