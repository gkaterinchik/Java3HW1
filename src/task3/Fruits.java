package task3;

public class Fruits<T> {
    private float weight;
    private boolean loaded=false; // флаг указывающий на то положен этот фрукт в коробку или нет

    public boolean isLoaded() {
        return loaded;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }


     Fruits(float weight){
        this.weight=weight;
    }
public float getWeight(){
    return this.weight;
}
    }
