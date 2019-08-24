package com.tony;

/**
 * Пример нестатического вложенного класса ([non-static] nested classes) ->
 * локальный класс (local class)
 *
 * Источник:
 * https://javarush.ru/groups/posts/vidy-vlozhennyh-klassov
 */
public class Person {

    private String name;
    private String street;
    private String house;

    public Person(String name, String street, String house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    public interface AddressContainer {
        String getStreet();
        String getHouse();
    }

    public AddressContainer getAddressContainer() {
        class PersonAddressContainer implements AddressContainer {
            @Override
            public String getStreet() {
                return Person.this.street;
            }

            @Override
            public String getHouse() {
                return Person.this.house;
            }
        }
        return new PersonAddressContainer();
    }
}
