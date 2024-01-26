package Task2;

// Класс для отображения значения
class ValueDisplayer implements Displayable {
    private final Object data;

    public ValueDisplayer(Object data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Значение: " + data);
    }
}