package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // Обчислення середніх точок між Y і Z
        double bx = (x2 + x3) / 2.0;
        double by = (y2 + y3) / 2.0;

        // Обчислення напрямного вектора бісектриси
        double directionX = bx - x1;
        double directionY = by - y1;

        // Нормалізація напрямного вектора
        double length = Math.sqrt(directionX * directionX + directionY * directionY);
        directionX /= length;
        directionY /= length;

        // Виведення коефіцієнтів загального рівняння бісектриси
        System.out.printf("%.3f %.3f %.3f", -directionY, directionX, -(directionX * x1 - directionY * y1));
    }
}
