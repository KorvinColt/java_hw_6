package Task4;

// Класс, реализующий интерфейс NumericValue
class NumericFns<T extends Number> implements NumericValue<T> {
    T num;

    // Конструктор класса NumericFns, принимающий числовый объект типа T.
    NumericFns(T n) {
        num = n;
    }

    // Метод для возврата абсолютного значения числа.
    public double absValue() {
        return Math.abs(num.doubleValue());
    }
}
