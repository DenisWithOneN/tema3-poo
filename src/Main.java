public class Main {
    public static void main(String[] args) {

        Carte carte1 = new Carte(200);
        Carte carte2 = new Carte(200);
        Piramida pir = new Piramida(4);

        if(carte1.equals(carte2)){
            System.out.println("Cartile au acelasi numar de pagini");
        } else System.out.println("Cartile au numar de pagini diferite");

        System.out.println();

        pir.constructiePiramida();

        System.out.println();

        int rezultat1 = Suma.suma(3,5);
        System.out.println("rezultatul 1 este " + rezultat1);

        int rezultat2 = Suma.suma(3,5,7);
        System.out.println("rezultatul 2 este " + rezultat2);

        int rezultat3 = Suma.suma(3,5,7,9);
        System.out.println("rezultatul 3 este " + rezultat3);

        System.out.println();

        Patrat patrat = new Patrat();
        patrat.afisareArieSiLatura();
        Patrat patrat2 = new Patrat(20);
        patrat2.afisareArieSiLatura();





    }

}