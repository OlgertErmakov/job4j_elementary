package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "�������� ����� ������� �� 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "�������� ����� ������� �� 3, �� �� �������� ������.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "�������� ����� �� ������� �� 3, �� �������� ������.";
        } else {
            rsl = "�������� ����� �� ������� �� 3 � �� �������� ������.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        int number = 17;
        String asd = DivideBySix.checkNumber(number);
        System.out.println(asd);
    }
}


