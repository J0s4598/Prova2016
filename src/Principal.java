
public class Principal {

	public static void main(String[] args) {
		BDSimulado bd = new BDSimulado();
		
		//Imprimir
		System.out.println(bd.getInfoPassageiro("Marta"));
		System.out.println(bd.getQtdeViagens("Caio"));
		System.out.println(bd.getMaiorViagem());
		System.out.println(bd.listaUFsViagem("Josue"));
		
		
		

	}

}
