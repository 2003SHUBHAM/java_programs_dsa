class btech{
    private int placement;
   private   String name;

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class cwh_accessmodifiers {
    public static void main(String[] args) {
        btech cs = new btech();
        cs.setName("shubham");
        System.out.println(cs.getName());
        cs.setPlacement(1000000);
        System.out.println(cs.getPlacement());
//        cs.name =" shubham";
//        cs.placement = 100;

    }
}