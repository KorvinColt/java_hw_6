package Task3;

// Обобщенный класс для хранения пары объектов разных типов
public class Pair<T, V extends T> {
    T first;
    V second;

    // Конструктор класса Pair, принимающий два объекта совместимых типов.
    // Добавлена проверка на null для параметров конструктора.
    Pair(T a, V b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Параметры конструктора не могут быть null");
        }

        first = a;
        second = b;
    }

    // Метод для получения первого объекта.
    T getFirst() {
        return first;
    }

    // Метод для получения второго объекта.
    V getSecond() {
        return second;
    }
}
