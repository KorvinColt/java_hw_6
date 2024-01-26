package Task1;

// Класс для отображения типа данных
class TypeDisplayer implements Displayable {
    private final Object data;

    public TypeDisplayer(Object data) {
        this.data = data;
    }

    @Override
    public void display() {
        System.out.println("Тип данных: " + data.getClass().getName());
    }
}