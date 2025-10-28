public class TazzaPerDadi {
   private Dado[] Dadi;
   private int capienza;
   private int Ndadi;
  public TazzaPerDadi(int capienza){
      this.capienza=capienza;
      this.Dadi=new Dado[capienza];
      Ndadi=0;
  }
  public TazzaPerDadi(int N,int F){
      this.capienza=N;
      for (int i = 0; i < N; i++) {
          this.Dadi[i]=new Dado(F);
      }
  }
  public boolean add(Dado d){
       if(Ndadi<capienza){
           Dadi[capienza]=d;
           Ndadi++;
           return true;
       }
       return false;
  }
  public int quanti(){
      return Ndadi;
  }
  public int size(){
      return capienza;
  }
  public boolean isempty(){
      if(Ndadi==0){
          return true;
      }
      return false;
  }
    public int getMassimo() {
        int somma = 0;
        for (int i = 0; i < Ndadi; i++) {
            somma += Dadi[i].getN();
        }
        return somma;
    }
    public int getminimo() {
      return  Ndadi;
    }
    public int lancia() {
      int somma = 0;
        for (int i = 0; i < Ndadi; i++) {
            somma += Dadi[i].lancia();
        }
        return somma;
    }
    public String toString() {
        String s = "Questa tazza può contenere al massimo " + capienza + " dadi.\n";
        s += "Dadi attualmente contenuti: " + Ndadi + "\n";

        if (Ndadi > 0) {
            s += "Lista dei dadi:\n";
            for (int i = 0; i < Ndadi; i++) {
                s += "- " + Dadi[i].toString() + "\n";
            }
        }

        return s;
    }
}
