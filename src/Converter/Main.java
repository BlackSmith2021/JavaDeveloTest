package Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите жалаемую систему исчислени; 2 или 16 для конвертирования десятичного числа");
        System.out.println("Введите 10 для конвертирования двоичного числа");

        int choiceOfSystem = sc.nextInt();  // ввод пользователе системы исчисления
        System.out.println("Введите число для конвертирования");

        String numberToConvert = sc.next();  // ввод конвертируемого значения
        int parseNumber = Integer.parseInt(numberToConvert); // преобразование строки numberToConvert в число

        // проверка диапазона вводимиго для конвертирования значения
        if (parseNumber > 0 && parseNumber < 10000) {

            switch (choiceOfSystem) {

                case (10) -> { // случай конвертировния в десячтичную систему
                    // отлов исключения при вводе не двоичного числа
                    try {
                        System.out.println("В десятичной системе " + parseNumber + " = " + Integer.parseInt(numberToConvert, 2));
                    } catch (NumberFormatException e) {
                        System.out.println("Введенное число не является двоичным. " + e.getMessage());
                    }
                }

                case (2) -> // случай для конвертирования в двоичную систему
                        System.out.println("В двоичной системе " + parseNumber + " = " + Integer.toBinaryString(parseNumber));

                case (16) ->  // случай для конвертирования в шестнадцатиричную систему
                        System.out.println("В шестнадцатиричной системе " + parseNumber + " = " + Long.toHexString(parseNumber));

                default -> System.out.println("Введены неверные данные при выборе системы исчисления!");
            }
        }

        else {
            System.out.println("Введено неверное значение для конвертирования");
        }
    }
}
