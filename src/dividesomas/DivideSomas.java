
package dividesomas;

public class DivideSomas {
    
    public static double divideSomas(double x, double y){
        
        if (x < 0 || y <= 0) {
            throw new IllegalArgumentException("Informe um valor válido para x e y!");
        }
        
        if (x < y) {
            throw new IllegalArgumentException("O valor de X deve ser maior que o de Y!");
        }
        
        double d = 0;
        double s = y;
        
        while(s <= x){
            s = s + y;
            d = d + 1;
        }
        
        return d;
    }

    public static void main(String[] args) {
        
        System.out.println(divideSomas(4,5));

    }
    
}
