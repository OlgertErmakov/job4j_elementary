package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "�����������", "Monday" -> 1;
            case "�������", "Tuesday" -> 1;
            case "�����", "Wednesday" -> 1;
            case "�������", "Thursday" -> 1;
            case "�������", "Friday" -> 1;
            case "�������", "Saturday" -> 1;
            case "�����������", "Sunday" -> 1;
            default -> -1;
        };
    }
}
