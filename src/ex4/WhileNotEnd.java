package ex4;

import java.util.Scanner;

/**
 * Вводити з клавіатури рядки, доки користувач не введе рядок 'end':
 * 1. Створити перелік рядків.
 * 2. Ввести рядки з клавіатури та додати їх до списку.
 * 3. Вводити з клавіатури рядки, доки користувач не введе рядок "end". "end" не враховувати.
 * 4. Вивести рядки на екран, кожен з нового рядка.
 */

public class WhileNotEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводьте все, що забажаєте. Програма після завершення роботи виведе все введене на екран.");
        System.out.println("Для завершення роботи введіть - end");
        StringBuilder sb = new StringBuilder();
        String value = "";
        while (!value.equals("end")){
            value = sc.nextLine();
            if (!value.equals("end")){
                sb.append(value).append("\n");
            }
        }
        System.out.print(sb);
    }
}
