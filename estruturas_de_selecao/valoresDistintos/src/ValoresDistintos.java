public class ValoresDistintos {
    public static void main(String[] args) 
    {
        System.out.println(numeroDeValoresDistintos (10, 10, 10, 10));//iguais
        System.out.println(numeroDeValoresDistintos (9, 10, 11, 5));
        System.out.println(numeroDeValoresDistintos (11, 8, 10, 10));//3 diferentes
        System.out.println(numeroDeValoresDistintos (11, 10, 10, 10));//2 diferentes
    }
    public static String numeroDeValoresDistintos (int v1, int v2, int v3, int v4)
    {
        if (v1 == v2 && v1 == v3 && v1 == v4){
            return ("sao iguais,ou seja, 1 numero distinto");
        }if ( v1 != v2 && v1 != v3 && v1 != v4 && v2 != v3 && v3 != v4){
            return ("4 numeros distintos");
        }else if ( (v1 == v2 || v1 == v3 || v1 == v4 || v2 == v3 || v2 == v4 || v3 == v4) && (v1 != v2 || v1 != v3 || v1 != v4 || v2 != v3 || v2 != v4 || v3 != v4)){
            return ("3 numeros DIFERENTES");
        }else {
            return ("2 numeros DIFERENTES");
        }
    }
    
}
