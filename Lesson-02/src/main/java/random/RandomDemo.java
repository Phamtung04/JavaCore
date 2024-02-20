package random;

import java.time.LocalDate;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println("a = " + a);

        // 0 <= random.nextInt(max) < max
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // min <= ? <= max
        // vd: lấy ra số ngẫu nhiên có 3 chữ số
        int min = 100;
        int max = 999;
        int c = min + random.nextInt(max - min + 1);
        System.out.println("c = " + c);

        // VD: lấy ra ngày ngẫu nhiên trong một khoảng thời gian
        LocalDate minDate = LocalDate.of(2000, 1, 1);
        LocalDate maxDate = LocalDate.of(2024,1, 1);
        int minDay = (int) minDate.toEpochDay();
        int maxDay = (int) maxDate.toEpochDay();
        int randomday = minDay + random.nextInt(maxDay - minDay + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomday);
        System.out.println("randomday = " + randomDate);

    }
}
