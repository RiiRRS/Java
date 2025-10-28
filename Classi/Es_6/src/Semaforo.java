public class Semaforo {
    private String Colore;
    private int colore;
    private boolean status=false;

   public  Semaforo(){
        this.status = false;
    }

    public void  Accendi(){
        this.status = true;
    }
    public void Spegni() {
        this.status = false;
    }
    public void toggle(){
       if(status){
           Accendi();
       } else  {
           Spegni();
       }
    }
    public void avanza(){
       if(!status){
           colore+=1;
           if (colore>3){
            colore=1;
         }
       }
   }
   public boolean isAcceso(){
       return this.status;
    }

    public String getColore() {
        String Colore = "";
        if (this.colore == 1) {
            Colore += "verde";
        } else if (this.colore == 2) {
            Colore += "giallo";
        } else if (this.colore == 3) {
            Colore += "rosso";
        }
        return Colore;
    }

    @Override
    public String toString() {
       if (this.status ==true) {
           return "il semaforo è acceso sul"+this.Colore;
       }
       else return "il semaforo è spento";
    }
}
