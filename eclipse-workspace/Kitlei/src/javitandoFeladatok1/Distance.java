package javitandoFeladatok1;

public class Distance {
    public static void main(String[] args) {
        double distance=0;
        
        Point p1 = new Point();
        Point p2 = new Point();
        
        p1.x=1;
        p1.y=2;
        p2.x=4;
        p2.y=6;
        
            distance = getDistance(p1,p2);
        
        
        System.out.println(distance);
    }
    
    static double getDistance(Point p1, Point p2) {
        return Math.sqrt(((p2.x-p1.x) * (p2.x-p1.x))  +  ((p2.y-p1.y) * (p2.y-p1.y)));
    }
}