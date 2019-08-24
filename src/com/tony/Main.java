package com.tony;

public class Main {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Peugeot", 120, 40);
        Bicycle.SteeringWheel wheel = bicycle.new SteeringWheel();
        Bicycle.Seat seat = bicycle.new Seat();
        seat.getSeatParam();
        seat.up();
        bicycle.start();
        wheel.left();
        wheel.right();

        Building.Shop myShop = new Building.Shop("Food & Sleep!", "Kaltaeva, 16");

        Person person = new Person("Nikita", "Sholohova", "19");
        Person.AddressContainer addressContainer = person.getAddressContainer();
        System.out.println("Address: street - " + addressContainer.getStreet() + ", house - " + addressContainer.getHouse());

        for (int i = 0; i < 5; i++) {
            Boeing737.Drawing drawing = new Boeing737.Drawing(i);
            System.out.println(drawing);
        }
    }
}
