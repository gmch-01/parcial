public class pc {
    /**
    * @paras args
     */
    public static void main(String [] args ) {
        // TADO Autogerenated method stab
        
        Scanner leer = new Scanner (System.in);
        int NumeroX;
        int NumeroY;

        NumeroX= leer.nextInt();
        NumeroY= leer.nextInt();

        int matriz [][] = new int [NumeroX][NumeroY];

        for (int i = 0; i<NumeroX; i++) {
            System.out.println();
            for (int j = 0; j<NumeroY; j++){

                matriz[i][j] = j*2;

                System.out.print(matriz [i][j]+ " ");
            }
        }

    }
}