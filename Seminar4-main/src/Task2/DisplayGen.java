package Task2;

// Обобщенный класс для хранения и отображения данных
class DisplayGen<T, V> {
    private final T ob1;
    private final V ob2;

    public DisplayGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void showTypes() {
        System.out.println("Тип T - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    public void displayData(Displayable displayer) {
        displayer.display();
    }
}