import java.util.ArrayList;
import java.util.Scanner;

public class Ratio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int dias = 0;
		System.out.println("Introduce el numero de dias");
		dias=sc.nextInt();
		ArrayList<Integer> Ratio = new ArrayList<Integer>();

		for (int i = 0; i <dias; i++) {
			System.out.println("Introduce el numero de llamadas");
			int nllamadas = sc.nextInt();
			System.out.println("Introduce el numero de ventas");
			int nVentas = sc.nextInt();
			int cRatio = (100 * nVentas) / nllamadas;
			Ratio.add(cRatio);

		}
		// mostrar ratios
		for (int i = 0; i < dias ; i++) {
			System.out.println("el ratio del dia"+i+"es"+Ratio.get(i));
		}

		// mostrar total
		int rTotal=0;
		for (int i = 0; i < Ratio.size(); i++) {
			 rTotal = Ratio.get(i) +rTotal;

		}
		int rmedtot = rTotal/dias;
		System.out.println("El ratio del mes es:"+rmedtot);
	}

}
