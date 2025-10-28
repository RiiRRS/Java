public class Playlist {
    private String nome;
    private Canzone[] brani;
    private int canzoni;
    private int status;
    private int corrente;

    public Playlist(String nome) {
        this.nome = nome;
        this.brani = new Canzone[100];
        this.canzoni = 0;
        this.status = 0;
        this.corrente = -1;
    }

    public Playlist(Playlist copiaPlaylist) {
        this.nome = copiaPlaylist.nome;
        this.canzoni = copiaPlaylist.canzoni;
        this.status = copiaPlaylist.status;
        this.corrente = copiaPlaylist.corrente;
        this.brani = new Canzone[100];
        for (int i = 0; i < copiaPlaylist.canzoni; i++) {
            this.brani[i] = copiaPlaylist.brani[i];
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantiBrani() {
        return this.canzoni;
    }

    public Canzone getCanzone(int n) {
        if (n < 1 || n > canzoni) {
            return null;
        }
        return brani[n - 1];
    }

    public boolean addCanzone(Canzone c) {
        if (canzoni >= 100) {
            return false;
        }
        brani[canzoni] = c;
        canzoni++;
        if (corrente == -1) corrente = 0;
        return true;
    }

    public int durataTotale() {
        int somma = 0;
        for (int i = 0; i < canzoni; i++) {
            somma += brani[i].getDurata();
        }
        return somma;
    }

    public void play() {
        if (canzoni > 0) this.status = 1;
    }

    public void pause() {
        if (this.status == 1) this.status = 2;
    }

    public void stop() {
        this.status = 0;
        this.corrente = 0;
    }

    public void branoSuccessivo() {
        if (canzoni > 0) {
            corrente = (corrente + 1) % canzoni;
        }
    }

    public void branoPrecedente() {
        if (canzoni > 0) {
            corrente = (corrente - 1 + canzoni) % canzoni;
        }
    }

    @Override
    public String toString() {
        String stato = "";
        if (status == 0) stato = "STOP";
        else if (status == 1) stato = "PLAY";
        else if (status == 2) stato = "PAUSE";

        String s = "Playlist " + nome + ", " + canzoni + " brani, in " + stato;
        if (status == 1 && corrente >= 0 && corrente < canzoni) {
            s += " sul brano\n" + brani[corrente].toString();
        }
        return s;
    }
}
