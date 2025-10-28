public class TabelloneTennis {
    private String nome1, nome2;
    private int sets1, sets2;
    private int games1, games2;
    private int punti1, punti2;
    private int servizio;
    private int tipoPartita;
    private boolean finita;

    public TabelloneTennis(String n1, String n2, int serv, int tipo) {
        nome1 = n1;
        nome2 = n2;

        if (serv == 1 || serv == 2) {
            servizio = serv;
        } else {
            servizio = 1;
        }

        if (tipo == 3 || tipo == 5) {
            tipoPartita = tipo;
        } else {
            tipoPartita = 3;
        }

        sets1 = 0;
        sets2 = 0;
        games1 = 0;
        games2 = 0;
        punti1 = 0;
        punti2 = 0;
        finita = false;
    }
    private String mostraPunti(int p) {
        if (p == 0) {
            return "0";
        } else if (p == 1) {
            return "15";
        } else if (p == 2) {
            return "30";
        } else {
            return "40";
        }
    }

    private void vinciGame(int g) {
        if (g == 1) {
            games1 = games1 + 1;
        } else {
            games2 = games2 + 1;
        }

        punti1 = 0;
        punti2 = 0;

        if ((games1 >= 6 && games1 - games2 >= 2) || games1 == 7) {
            vinciSet(1);
        } else if ((games2 >= 6 && games2 - games1 >= 2) || games2 == 7) {
            vinciSet(2);
        } else {
            cambiaServizio();
        }
    }

    private void vinciSet(int g) {
        if (g == 1) {
            sets1 = sets1 + 1;
        } else {
            sets2 = sets2 + 1;
        }

        games1 = 0;
        games2 = 0;
        punti1 = 0;
        punti2 = 0;
        cambiaServizio();

        int setNecessari;
        if (tipoPartita == 5) {
            setNecessari = 3;
        } else {
            setNecessari = 2;
        }

        if (sets1 >= setNecessari || sets2 >= setNecessari) {
            finita = true;
        }
    }

    private void cambiaServizio() {
        if (servizio == 1) {
            servizio = 2;
        } else {
            servizio = 1;
        }
    }


    public boolean aggiungiPunto(int giocatore) {
        if (finita) {
            return false;
        }

        if (giocatore != 1 && giocatore != 2) {
            return false;
        }

        if (giocatore == 1) {
            punti1 = punti1 + 1;
        } else {
            punti2 = punti2 + 1;
        }

        if (punti1 >= 4 || punti2 >= 4) {
            int diff = punti1 - punti2;
            if (diff >= 2) {
                vinciGame(1);
            } else if (diff <= -2) {
                vinciGame(2);
            }
        }

        return true;
    }

    public String vittoria() {
        int setNecessari;
        if (tipoPartita == 5) {
            setNecessari = 3;
        } else {
            setNecessari = 2;
        }

        if (sets1 >= setNecessari) {
            return nome1;
        } else if (sets2 >= setNecessari) {
            return nome2;
        } else {
            return "";
        }
    }

    public String toString() {
        String riga1 = nome1;
        if (servizio == 1) {
            riga1 = riga1 + " * ";
        } else {
            riga1 = riga1 + " ";
        }
        riga1 = riga1 + sets1 + " " + games1 + " " + mostraPunti(punti1);

        String riga2 = nome2;
        if (servizio == 2) {
            riga2 = riga2 + " * ";
        } else {
            riga2 = riga2 + " ";
        }
        riga2 = riga2 + sets2 + " " + games2 + " " + mostraPunti(punti2);

        return riga1 + "\n" + riga2;
    }

}
