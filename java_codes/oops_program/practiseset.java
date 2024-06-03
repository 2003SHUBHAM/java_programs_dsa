class cylinder{
    private int radius ;
    private int height ;

    public void setRadius(int r){
        this.radius = r;
    }
    public int getRadius(){
        return radius;

    }public void  setHeight(int h){
        this.height = h;

    }public int getHeight(){
      return height;
    }
    public double surfaceArea(int a , int b){
        return 2*Math.PI*radius*height *a * b;
    }
    public double volume(){
        return Math.PI *radius * radius *height;
    }

}


public class practiseset {
    public static void main(String[] args) {
      cylinder c = new cylinder();
      c.setHeight(4);
//        System.out.println(c.getHeight());
        c.setRadius(2);
//        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea(2,3));
        System.out.println(c.volume());
        rectangle r = new rectangle(4,6);

//        r.length = 4;
//        r.breadth = 6;
//        System.out.println(r.rectangle());
    }
}
class rectangle{
    int length;
    int breadth;
//    public rectangle(){
//        System.out.println(length * breadth);
//    }
    public rectangle(int len , int bre){
        int area = len * bre;
        System.out.println(area);
    }
}
