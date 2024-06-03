class babloo{
    public String name;

    public babloo(String name) {
        System.out.println(" i am father of vinit ");
        this.name = name;
    }



    public String getName() {
        return name;
    }
}
class vinit extends babloo{
    public vinit(String name2) {
        super(name2);
        System.out.println("i am brother of " + name2);
    }
}

public class cwh_this_super {
    public static void main(String[] args) {
        babloo b =new babloo("vinit");
        System.out.println(b.getName());
        vinit v = new vinit("ujjwal");


    }
}
