class animal{
    public String name;

    public String getName() {
        System.out.println("this animal is dangerous "+ name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class omnivores extends animal{
    public String forest ;

    public String getForest() {
        System.out.println("this animal is found in "+ forest);
        return forest;
    }

    public void setForest(String forest) {
        this.forest = forest;
    }
}
class third extends omnivores{
    public String eat ;

    public String getEat() {
        System.out.println("this animal eat " + eat);
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }
}
public class cwh_inheritence_2 {
    public static void main(String[] args) {
        third xy =new third();
        xy.name ="tiger";
        xy.forest="sunderbans";
        xy.eat="flesh";
        System.out.println(xy.getName());
        System.out.println(xy.getForest());
        System.out.println(xy.getEat());
    }
}
