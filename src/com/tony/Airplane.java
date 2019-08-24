package com.tony;

/**
 * Пример нестатического вложенного класса ([non-static] nested classes) ->
 * внутренний класс (inner classes)
 *
 * Источник:
 * https://javarush.ru/groups/posts/vidy-vlozhennyh-klassov
 */
public class Airplane {

    private String name;
    private String id;
    private String flight;
    private Wing leftWing = new Wing("Red", "X3");
    private Wing rightWing = new Wing("Blue", "X3");

    public Airplane(String name, String id, String flight) {
        this.name = name;
        this.id = id;
        this.flight = flight;
    }

    /**
     * Крыло
     */
    private class Wing {
        private String color, model;

        public Wing(String color, String model) {
            this.color = color;
            this.model = model;
        }
    }
}
