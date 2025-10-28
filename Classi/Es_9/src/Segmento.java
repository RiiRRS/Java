public class Segmento {
    private Punto estremo1;
    private Punto estremo2;

    public Segmento(Punto estremo1, Punto estremo2) {

        this.estremo1 = new Punto(estremo1);
        this.estremo2 = new Punto(estremo2);

    }

    public Segmento(Segmento altro) {
        this.estremo1 = new Punto(altro.estremo1);
        this.estremo2 = new Punto(altro.estremo2);
    }
//da rivedere
    public boolean interseca(Segmento altro) {

        double x1 = estremo1.getX();
        double y1 = estremo1.getY();

        double x2 = estremo2.getX();
        double y2 = estremo2.getY();

        double x3 = altro.estremo1.getX();
        double y3 = altro.estremo1.getY();

        double x4 = altro.estremo2.getX();
        double y4 = altro.estremo2.getY();

        double r = ((x1 - x2) * (y1 - y2)) - ((x3 - x4) * (y3 - y4));

        return r != 0;
    }


    public boolean equals(Segmento altro) {
        return (estremo1.getX() == altro.estremo1.getX() && estremo1.getY() == altro.estremo1.getY() &&
                estremo2.getX() == altro.estremo2.getX() && estremo2.getY() == altro.estremo2.getY());
    }

    @Override
    public String toString() {
        return "{(" + estremo1.getX() + ", " + estremo1.getY() + "), (" +
                estremo2.getX() + ", " + estremo2.getY() + ")}";
    }

}
