import java.util.Locale;
import java.util.Scanner;

	public class Main {
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
//WHILE			
//			int senha = sc.nextInt();
//			while(senha!=123) {
//				System.out.println("digite novamente");
//				senha = sc.nextInt();
//			}
//			System.out.println("senha correta");
			
//FOR
			String s = "potato apple lemon";
			String[] vect = s.split(" ");
			String word1 = vect[0];
			String word2 = vect[1];
			String word3 = vect[2];
			
			System.out.println(vect[1]);
			
			sc.close();
}
}
