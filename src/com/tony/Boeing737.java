package com.tony;

/**
 * Пример статического вложенного класса (static nested classes)
 *
 * Источник:
 * https://javarush.ru/groups/posts/2183-staticheskie-vlozhennihe-klassih
 */
public class Boeing737 {

    private int manufactureYear;
    private static int maxPassengersCount;

    static {
        maxPassengersCount = 300;
    }

    public Boeing737(int manufatureYear) {
        this.manufactureYear = manufatureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {

        private int id;

        public Drawing(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }

        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }
    }
}
