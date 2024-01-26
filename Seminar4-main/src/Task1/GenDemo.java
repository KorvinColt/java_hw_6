package Task1;

// Класс GenDemo для демонстрации использования обобщенных классов
public class GenDemo {
    public static void main(String[] args) {
        // Создаем объект типа DisplayGen<Integer>
        DisplayGen<Integer> iOb = new DisplayGen<>(88);

        // Отображаем тип данных, используемый в объекте iOb
        iOb.showType();

        // Получаем значение из объекта iOb
        int v = iOb.getob();
        System.out.println("Значение: " + v);

        System.out.println();

        // Создаем объект типа DisplayGen<String>
        DisplayGen<String> strOb = new DisplayGen<>("Тестирование");

        // Отображаем тип данных, используемый в объекте strOb
        strOb.showType();

        // Получаем значение из объекта strOb
        String str = strOb.getob();
        System.out.println("Значение: " + str);

        System.out.println();

        // Отображение данных с использованием интерфейсов
        iOb.displayData(new TypeDisplayer(iOb.getob()));
        iOb.displayData(new ValueDisplayer(iOb.getob()));
        strOb.displayData(new TypeDisplayer(strOb.getob()));
        strOb.displayData(new ValueDisplayer(strOb.getob()));
    }
}