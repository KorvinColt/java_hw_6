package Task2;

// Класс TwoGen для демонстрации обобщенных классов
public class TwoGenDemo {
    public static void main(String[] args) {
        // Создаем объект типа DisplayGen<Integer, String>
        DisplayGen<Integer, String> tgObj = new DisplayGen<>(88, "Обобщения");

        // Отображаем типы данных, используемые в объекте tgObj
        tgObj.showTypes();

        // Получаем и отображаем значение типа T
        int v = tgObj.getOb1();
        System.out.println("Значение T: " + v);

        // Получаем и отображаем значение типа V
        String str = tgObj.getOb2();
        System.out.println("Значение V: " + str);

        // Отображение данных с использованием интерфейсов
        tgObj.displayData(new TypeDisplayer(tgObj.getOb1()));
        tgObj.displayData(new ValueDisplayer(tgObj.getOb2()));
    }
}