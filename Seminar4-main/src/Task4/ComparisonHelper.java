package Task4;

// Класс для сравнения объектов NumericFns
class ComparisonHelper {
    static boolean absEqual(NumericValue<?> ob1, NumericValue<?> ob2) {
        return ob1.absValue() == ob2.absValue();
    }
}