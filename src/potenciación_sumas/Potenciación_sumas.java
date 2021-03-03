
package potenciación_sumas;

import javax.swing.JOptionPane;


public class Potenciación_sumas {

 
    public static void main(String[] args) {
      sumasPotencias();
    }
    
    private static void sumasPotencias(){
        double num, res, res1, res2, limite;
        double t;
        int mismo=0;
        
        num = Double.parseDouble(JOptionPane.showInputDialog("Escriba el numero que quieres llegar a el, sumando sus potencias: "));
        System.out.println((int)num);
        
        String salida=" ";
        res=0;
        t=0;
        limite=200;
        
        for(int i=1; i<=limite; i++){
            if(i > num)break;
            mismo=0;
            
            for(int j=2; j<=limite; j++){
                res1 = Math.pow(i,j);
                if(res1 > num)break;
                
                for(int k=1; k<=limite; k++){
                    if(k > num)break;
                    for(int z=2; z<=limite; z++){
                        res2=Math.pow(k,z);
                        if(res2 > num)break;
                        
                        res = res1 + res2;
                        
                        if(res == num){
                            salida += i + " elevado a la " + j +" "+ "es igual a: "+ (int) res1 + " y ";
                            salida += k + " elevedo a la " + z +" "+ "es igual a: "+ (int) res2 + " y ";
                            salida += "la suma de suspotencias es igual a: "+(int) res + "\n";
                        }
                        if(res == num && mismo ==0){
                            t++;
                            mismo=1;
                        }
                        
                        if(k == 1)break;
                        
                    }
                }
                
                if(i == 1)break;
            }
        }
        
        if(t>0) t=(t/2)+.5;
        
        System.out.println("\n"+ salida + " "+ "Solo tiene: "+ (int)t);
    }
    
}
