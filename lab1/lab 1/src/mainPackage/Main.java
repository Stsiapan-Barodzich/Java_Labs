package mainPackage;

public class Main {


    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int Cheescount = 0;
        int Applecount = 0;
        int Lemonadecount =0;
        for(int itemIndex=0; itemIndex <args.length; itemIndex++)
        {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese"))
            {
                breakfast[itemIndex] = new Cheese();

            } else if (parts[0].equals("Apple"))
            {
                // У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemIndex] = new Apple(parts[1]);

            }
            else if (parts[0].equals("Lemonade"))
            {
                // У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemIndex] = new Lemonade(parts[1]);

            }

            // ... Продолжается анализ других продуктов для завтрака
        }
        // Перебор всех элементов массива
        for (Food item: breakfast) {
            // Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не использованы все
            if (item==null) break;
            // Если элемент не null – употребить продукт
            item.consume();
        }
        Apple apple1 = new Apple("");
        Cheese chees1 = new Cheese();
        Lemonade lemonade1 = new Lemonade("");

        for(int i=0;i<args.length;i++)
        {
            if(breakfast[i].equals(apple1)){
                Applecount++;
            }else if(breakfast[i].equals(chees1)){
                Cheescount++;
            }else if(breakfast[i].equals(lemonade1)){
                Lemonadecount++;
            }
        }
        System.out.println("Сьедено сыра: " + Cheescount);
        System.out.println("Сьедено яблок: "+Applecount);
        System.out.println("Выпито лимонада: "+Lemonadecount);
        System.out.println("Всего хорошего!");
    }
}
