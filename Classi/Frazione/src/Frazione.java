public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione() {
        numeratore = 0;
        denominatore = 0;
    }

    public Frazione(int numeratore, int denominatore) {
        if (denominatore == 0) {
            denominatore = 1;
        }
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }
//costruttore di copia
    public Frazione(Frazione altro) {
        this.numeratore = altro.numeratore;
        this.denominatore = altro.denominatore;
    }

    public int getNumeratore() {
        return numeratore;
    }

    public void setNumeratore(int numeratore) {
        this.numeratore = numeratore;
    }

    public int getDenominatore() {
        return denominatore;
    }

    public void setDenominatore(int denominatore) {
        if (denominatore != 0){
            this.denominatore = denominatore;
        }
    }

    public double toDouble() {
        return (double) numeratore / denominatore;
    }

    public Frazione somma(Frazione altra) {
        int num = this.numeratore * altra.denominatore + altra.numeratore * this.denominatore;
        int den = this.denominatore * altra.denominatore;
        return new Frazione(num, den);
    }

    public Frazione differenza(Frazione altra) {
        int num = this.numeratore * altra.denominatore - altra.numeratore * this.denominatore;
        int den = this.denominatore * altra.denominatore;
        return new Frazione(num, den);
    }

    public Frazione prodotto(Frazione altra) {
        int num = this.numeratore * altra.numeratore;
        int den = this.denominatore * altra.denominatore;
        return new Frazione(num, den);
    }

    public Frazione quoziente(Frazione altra) {
        int num = this.numeratore * altra.denominatore;
        int den = this.denominatore * altra.numeratore;
        return new Frazione(num, den);
    }

    public boolean equals(Frazione altra) {

        Frazione f1 = new Frazione(this.numeratore, this.denominatore);
        Frazione f2 = new Frazione(altra.numeratore, altra.denominatore);

        return f1.toDouble() == f2.toDouble();

    }

    @Override
    public String toString() {

        int num = numeratore;
        int den = denominatore;

        int a = num;
        int b = den;

        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        int mcd;
        if (a == 0) mcd = 1;
        else mcd = a;
        num = num / mcd;
        den = den / mcd;

        if (den == 1) {
            return "" + num;
        } else return num + "/" + den;

    }
}
