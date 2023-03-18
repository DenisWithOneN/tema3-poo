public class Patrat {

    private int latura;

    public Patrat() {
        this.latura = 10;
    }

    public Patrat(int latura) {
        this.latura = latura;
    }
    public void afisareArieSiLatura() {
        int a = latura * latura;

        System.out.println("Patrat " +  latura + " Aria " + a);
    }

    public void afisareArieSiLatura(int latura) {
        int a = latura * latura;

        System.out.println("Patrat "+  latura + "Aria " + a);
    }



}