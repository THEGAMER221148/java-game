public class Vector2D {
    public double x;
    public double y;
    public double vx;
    public double vy;

    public Vector2D(String encoded){
        
    }

    public Vector2D(double initx, double inity){
        x = initx;
        y = inity;
        vx = 0;
        vy = 0;
    }

    public Vector2D(double initx, double inity, double initvx, double initvy){
        x = initx;
        y = inity;
        vx = initvx;
        vy = initvy;
    }

    public String toString(){
        return "[" + x + "," + y + "," + vx + "," + vy + "]";
    }

}
