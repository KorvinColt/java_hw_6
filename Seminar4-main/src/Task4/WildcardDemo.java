package Task4;

// Пример использования
public class WildcardDemo {
    public static void main(String[] args) {
        // Создание объектов NumericFns с разными числовыми типами.
        NumericFns<Integer> iOb = new NumericFns<>(5);
        // NumericFns<String> sOb = new NumericFns<>("5"); // Ошибка компиляции
        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5L);

        System.out.println("Сравнение iOb и dOb:");
        if (ComparisonHelper.absEqual(iOb, dOb)) {
            System.out.println("Абсолютные значения совпадают.");
        } else {
            System.out.println("Абсолютные значения отличаются.");
        }

        System.out.println("\nСравнение iOb и lOb:");
        if (ComparisonHelper.absEqual(iOb, lOb)) {
            System.out.println("Абсолютные значения совпадают.");
        } else {
            System.out.println("Абсолютные значения отличаются.");
        }
    }
}