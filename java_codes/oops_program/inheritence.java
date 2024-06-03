class circle {
    int radius ;
    public double Area(int radius){
        return 2*Math.PI *radius;
    }
}
class cyl extends  circle{
    int height;
    public double Area(int radius){
        return 2*Math.PI *radius *height;
    }



}

public class inheritence {
    public static void main(String[] args) {
            cyl c = new cyl();
//            c.radius = 4;
            c.height =2;
        System.out.println(c.Area(4));
    }
}
