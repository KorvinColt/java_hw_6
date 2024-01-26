package Task1;

// Обобщенный класс для хранения и отображения данных
class DisplayGen<T> {
    private final T ob;

    public DisplayGen(T o) {
        ob = o;
    }

    public T getob() {
        return ob;
    }

    // Метод для отображения типа данных
    public void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }

    // Метод для отображения данных с использованием интерфейса Displayable
    public void displayData(Displayable displayer) {
        displayer.display();
    }
}
