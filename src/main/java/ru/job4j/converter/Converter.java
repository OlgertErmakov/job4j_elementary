package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float in2 = 180;
        float expectedE = 2;
        float expectedD = 3;
        float outE = Converter.rubleToEuro(in);
        float outD = Converter.rubleToDollar(in2);
        boolean passedE = expectedE == outE;
        boolean passedD = expectedD == outD;
        System.out.println("140 rubles To Euro are 2. Test result : " + passedE);
        System.out.println("180 rubles To Dollar are 3. Test result : " + passedD);
    }

}
