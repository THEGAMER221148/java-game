public class Vector2D {
    public double x;
    public double y;
    public double vx;
    public double vy;

    public Vector2D(String encoded){
        String[] split = encoded.split(",");
        x = Double.parseDouble(split[0]);
        y = Double.parseDouble(split[1]);
        vx = Double.parseDouble(split[2]);
        vy = Double.parseDouble(split[3]);
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
        return x + "," + y + "," + vx + "," + vy;
    }

}
