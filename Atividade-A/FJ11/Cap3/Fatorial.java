package FJ11;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fatorial = 1;
		
        for (int i = 1; i <= 30; i++) {

            while (i >= 2){
                fatorial = fatorial * i;
                break;            
            }System.out.println("Fatorial de "+i+" = "+fatorial);
}
	}

}