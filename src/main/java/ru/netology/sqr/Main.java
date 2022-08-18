package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int calc = service.SQRInRange(500, 1000);
        System.out.println(calc);
    }

}

