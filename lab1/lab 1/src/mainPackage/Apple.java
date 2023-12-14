package mainPackage;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;
    public Apple(String size) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
        // Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    //Геттер для доступа к полю данных РАЗМЕР
    public String getSize() {
        return size;
    }
    // Сеттер для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределенная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
