package seminars.third.hw;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%


    // 1
    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    // 2
    public boolean numberInterval(int n) {
        if (n >= 25 && n <=100) {
            return true;
        }
            return false;
    }

}
