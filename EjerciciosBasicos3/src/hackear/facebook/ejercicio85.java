package hackear.facebook;


public class ejercicio85 {
       public static void main(String[] args) {
       int matriz[][]= new int[3][3];
       int aux = 0;
       for(int i=0; i<4; i++){
           for(int j=0;j<4;j++){
               matriz[i][j]=(int) (Math.random()* 100);
               
           }
       }
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               System.out.println(matriz[i][j]);
           }
       }
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               if(i<j){
                   aux=aux+matriz[i][j];
               }
           }
       }
        System.out.println(aux);
    }
}
