public class Carte {

    private int pagini;

    public Carte(int pagini) {
        this.pagini = pagini;
    }

    public boolean equals(Carte carte){
        if(this.pagini == carte.pagini){
            return true;
        } else return false;
    }
}
