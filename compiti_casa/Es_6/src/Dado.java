public class Dado {
    private int faccieDado;

    static class valoreinvalidoException extends Exception {
        int value;
        public valoreinvalidoException(int v) {
            value = v;
        }
        public String toString() {
            return "Valore non valido: " + value;
        }
    }

    Dado(){
        this.faccieDado = 6;
    }

    Dado(int N) throws valoreinvalidoException {
        if (N<2 || N==3) {
            throw new valoreinvalidoException(N);
        }

        else {
            this.faccieDado = N;
        }
    }

    Dado(Dado dadoCopia) {
        this.faccieDado = dadoCopia.faccieDado;
    }

    public int getFaccieDado() {
        return faccieDado;
    }

    public int lancia(){
        return (int) (Math.random() * 10 % this.faccieDado + 1);
    }

    @Override
    public String toString() {
        return "Faccie del dado: " + this.faccieDado;
    }
}