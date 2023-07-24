package prueba1;
import java.util.*;

public class main {
	public static List<Integer> calculoPago(List<Integer> deudas){
		List<Integer> res=new ArrayList<>();
		for (int deuda:deudas) {
			int pagado=0;
			int diaActual=1;
			while(pagado<deuda) {
				int pagoDia=Math.min((int)Math.pow(2, diaActual-1),deuda-pagado);
				pagado+=pagoDia;
				diaActual++;
			}
			res.add(diaActual-1);
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Hola SmartSoft");
		System.out.println();
		
		List<Integer> deudaInicial=new ArrayList<>();
		deudaInicial.add(3);
		deudaInicial.add(15);
		deudaInicial.add(16);
		deudaInicial.add(45);
		
		List<Integer> diasNecesarios=calculoPago(deudaInicial);
		System.out.println(diasNecesarios);
	}
}
