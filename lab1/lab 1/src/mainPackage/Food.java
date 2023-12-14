package mainPackage;

public  class Food implements Consumable {
    String name = null;

    public Food(String name) {
        this.name = name;
    }
    // Переопределенная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false;// Шаг 1
        if (name==null || ((Food)arg0).name==null) return false;// Шаг 2
        return name.equals(((Food)arg0).name);// Шаг 3
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void consume() {

    }
}
