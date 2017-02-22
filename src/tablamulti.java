import java.util.Scanner;

public class tablamulti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		boolean seguir = true;
		while (seguir) {
			System.out.println("Seleciona un numero para multiplicar o salir");
			String opt = sc.next();
			switch (opt) {

			case "1":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (1 * i));

				}
				break;
			case "2":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (2 * i));

				}

				break;
			case "3":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (3 * i));

				}

				break;
			case "4":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (4 * i));

				}

				break;
			case "5":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (5 * i));
				}

				break;
			case "6":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (6 * i));

				}

				break;
			case "7":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (7 * i));

				}

				break;
			case "8":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (8 * i));

				}

				break;
			case "9":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (9 * i));

				}

				break;
			case "10":
				for (int i = 0; i <= 10; i++) {
					System.out.println("La tabla del uno es " + (10 * i));

				}

				break;
			case "11":
				System.out.println("Salir...");
				seguir = false;
				break;

			}
		}
	}
}
