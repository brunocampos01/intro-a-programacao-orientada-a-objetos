public class Fatorial2 {
    public static void main(String[] args) {
        System.out.println(fatorial (5));
    }
public static double fatorial (int n){
  double fat = 1;
		for (int i=n; i > 1; i--) {
			fat *= i; 
		}
		return fat;
	}
}
