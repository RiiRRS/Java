
public class Dado {
    private int n ;
    private int lancio;


    public Dado (){
        this.n=6;
    }

    public Dado (int n ){
        this.n=n;
        if (n<=3) {
            this.n=6;
        }
    }
    public int getN(){return this.n;}

    public int lancia(){
        this.lancio= (int)(Math.random() * n) +1;
        return lancio;
    }
    @Override
    public String toString(){
        return "n faccie"+n;
    }
}