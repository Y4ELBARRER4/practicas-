import  java.util. * ;
 clase  pública figura2 {
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
                si (i == j) {
                    matriz [i] [j] = "  " ;  
                } más {
                    matriz [i] [j] =  " x " ;
                }    
             }

            }
            para (j = 0 ; j < m; j ++ ) {
                matriz [y] [j] = "  " ;    
                y - ;
           }

           para (i = 0 ; i < n; i ++ ) {
            para (j = 0 ; j < m; j ++ ) {
              Sistema . a cabo . print ( " [ "  + matriz [i] [j] +  "   ] " );
            }
            Sistema . a cabo . println ();
         }

        
    }
}