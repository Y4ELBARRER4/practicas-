import  java.util.Scanner ;
 clase  pública figura3 {

    public  static  void  main ( String [] args ) {

        int i, j;

        Scanner teclado =  nuevo  escáner ( System . In );

        Sistema . a cabo . println ( " Ingrese las filas de la matriz " );

        int n = teclado . nextInt ();
        int y = n - 1 ;
        Sistema . a cabo . println ( " Ingrese las columnas de la matriz " );

        int m = teclado . nextInt ();

        Cadena matriz [] [] =  nueva  Cadena [n] [m];

        para (i = 0 ; i < n; i ++ ) {
            para (j = 0 ; j < m; j ++ ) {
                    matriz [i] [j] = "  " ;  
                }    
             }
             // / llena la matriz por filas
        para (i = 0 ; i < m; i ++ ) {
            matriz [ 0 ] [i] = " x " ;
            matriz [n - 1 ] [i] = " x " ;
        }
        // llena la matriz por columnas
        para (i = 0 ; i < n; i ++ ) {
            matriz [i] [ 0 ] = " x " ;
            matriz [i] [m - 1 ] = " x " ;
        }

        // / se imprime la matriz final
        para (i = 0 ; i < n; i ++ ) {
            para (j = 0 ; j < m; j ++ ) {
              Sistema . a cabo . print ( " [ "  + matriz [i] [j] +  "   ] " );
            }
            Sistema . a cabo . println ();
         }
    }
}