package task3;

import java.util.ArrayList;

public class Box<T extends Fruits> {
    private float weight = 0;
    private Class<? extends Fruits> contentType;
    private ArrayList <T> filling = new ArrayList<>();

    void compare(Box box){
        if(this.weight==box.weight)
        {
            System.out.println("true");
        }
        else System.out.println("false");
    }

    void add(T fruit) {
        if(contentType==null&& !fruit.isLoaded()){
        contentType=fruit.getClass();
        filling.add(fruit);
        fruit.setLoaded(true);
    }
        else if(contentType==fruit.getClass()&& !fruit.isLoaded())
        {
            filling.add(fruit);
            fruit.setLoaded(true);
        }
        else if(fruit.isLoaded())
            System.out.println("этот фрукт уже лежит в другом ящике");
        else{
            System.out.println("нельзя положить "+ fruit.getClass().getName()+" в коробку с "+ contentType.getName());
        }
    }

    void transferBox(Box box){
        if(this.contentType==box.contentType)
        {
           this.filling.addAll(box.filling);
           box.contentType=null;
           box.filling.clear();
        }
        else
            System.out.println("нельзя смешивать разные фрукты!");
    }

    public  void getWeight() {
        if (!filling.isEmpty()) {
            for (T element : this.filling
            ) {
                weight = weight + element.getWeight();
            }
            System.out.println(weight);

        }
        else System.out.println("Коробка пустая");
    }
}
