/*
დაწერეთ კლასი Vehicle ველებით: მოდელი, ცხენის ძალა, მაქს. სიჩქარე.
განსაზღვრეთ შვილი კლასები. მაგალითად, Car, Bus, SportCar.
და ამათი კონკრეტული მწარმოებლები: Porsche, Mercedes, BMW, Ford, GAZ, VAZ და ა.შ.
ინიციალიზაციის ბლოკი დაუწერეთ Vehicle კლასს რომელიმე ერთ ველზე მაინც.
გადაუფარეთ მანქანას toString მეთოდი, რომელიც ყველა შთამომავალს გაყვება.
სადემონსტრაციოდ, მთავარ მეთოდში შექმენით მანქანების მასივი, შემდგომ გაანულეთ
ეს მასივი (მისი რეფერენსი) და გამოიძახეთ System.gc(). ნახეთ რა შედეგს მიიღებთ.
 */


package org.tsu;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Vehicle[] arr = new Vehicle[3];

        Car car = new Car("model1", "maker1", 10, 11);
        arr[0] = car;
        arr[1] = new Bus("model2", "maker2", 20, 12);
        arr[2] = new SportsCar("model3", "maker3", 30, 13);

        System.out.println(arr[0].toString());
        System.out.println(Arrays.toString(arr));

        arr = null;
        System.gc();


        System.out.println(car.toString());

    }
}

