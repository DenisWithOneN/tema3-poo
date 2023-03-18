public class Piramida {

    private int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void constructiePiramida(){

        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=n+1-i; j++){
                System.out.print(i);
            }

            for(int space = 0; space < i; space++){

                System.out.print(" ");
            }

                System.out.println();

        }


    }
}
