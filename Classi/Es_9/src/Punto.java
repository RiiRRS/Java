public class Punto {
    private double x;
    private double y;


    public void valoreZero(){
        this.x = 0;
        this.y = 0;
    }

    public void cordinate(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto (Punto p){
        this.x = p.x;
        this.y = p.y;
    }

    public double distanza(Punto d){

        return Math.sqrt(Math.pow(this.x-d.x,2)+ Math.pow(this.y-d.y,2));

    }

    public Punto puntoMedio (Punto d){

        Punto medio = new Punto (d);
        medio.x = (d.x + this.x) / 2;
        medio.y = (d.y + this.y) / 2;

        return medio;

    }


    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punto (" + this.x + "," + this.y + ")";
    }
}
