package com.tony;

/**
 * Пример статического вложенного класса (static nested classes)
 *
 * Источник:
 * https://javarush.ru/groups/posts/vidy-vlozhennyh-klassov
 */
public abstract class Building {

    private String name;
    private String address;
    private String type;

    protected void setType(String type) {
        this.type = type;
    }

    public Building(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static class House extends Building {
        public House(String name, String address) {
            super(name, address);
            setType("House");
        }
    }

    public static class Shop extends Building {
        public Shop(String name, String address) {
            super(name, address);
            setType("Shop");
        }
    }
}
