import java.util.ArrayList;

public class BDSimulado {
	
	//Atributo
	private ArrayList<Passageiro> passageiros;
	private ArrayList<Viagem> viagems;
	
	//Metodo construtor
	public BDSimulado(){
		
		//Criar lista de passageiro
		this.passageiros = new ArrayList<Passageiro>();
		
		//Prencher a lista
		Passageiro p1 = new Passageiro("Marta", 55, "Brasilía", "DF");
		Passageiro p2 = new Passageiro("Alice", 35, "Brasilía", "DF");
		Passageiro p3 = new Passageiro("Luis", 46, "Brasilía", "DF");
		Passageiro p4 = new Passageiro("Waldyr", 34, "Brasilía", "DF");
		Passageiro p5 = new Passageiro("Josue", 18, "Brasilía", "DF");
		Passageiro p6 = new Passageiro("Caio", 38, "Brasilía", "DF");
		Passageiro p7 = new Passageiro("Marcos", 20, "Brasilía", "DF");
		Passageiro p8 = new Passageiro("Lorena", 22, "Brasilía", "DF");
		Passageiro p9 = new Passageiro("Alexandra", 21, "Brasilía", "DF");
		Passageiro p10 = new Passageiro("Gabriella", 23, "Brasilía", "DF");
		
		this.passageiros.add(p1);
		this.passageiros.add(p2);
		this.passageiros.add(p3);
		this.passageiros.add(p4);
		this.passageiros.add(p5);
		this.passageiros.add(p6);
		this.passageiros.add(p7);
		this.passageiros.add(p8);
		this.passageiros.add(p9);
		this.passageiros.add(p10);
		
		//Criar lista de Viagem
		this.viagems = new ArrayList<Viagem>();
		
		//Criar Lista de Viagem
		Viagem v1 = new Viagem(1, 5, 2017, p1, "Rogerio", 2.5, 12.50, "Brasilía", "DF");
		Viagem v2 = new Viagem(2, 7, 2017, p2, "Mario", 1.0, 5.00, "Brasilía", "SP");
		Viagem v3 = new Viagem(3, 4, 2017, p3, "Lucas", 2.2, 10.00, "Brasilía", "MG");
		Viagem v4 = new Viagem(4, 8, 2017, p4, "Bruno", 3.0, 19.75, "Brasilía", "SP");
		Viagem v5 = new Viagem(5, 5, 2017, p5, "Mairon", 4.5, 20.00, "Brasilía", "DF");
		Viagem v6 = new Viagem(6, 3, 2017, p6, "Luigi", 5.0, 25.16, "Brasilía", "DF");
		Viagem v7 = new Viagem(7, 9, 2017, p7, "Sonic", 0.9, 4.61, "Brasilía", "MG");
		Viagem v8 = new Viagem(8, 10, 2017, p8, "Links", 1.6, 9.00, "Brasilía", "MG");
		Viagem v9 = new Viagem(9, 12, 2017, p9, "Matheus", 2.1, 12.00, "Brasilía", "SP");
		Viagem v10 = new Viagem(10, 1, 2017, p10, "Daniel", 1.1, 5.00, "Brasilía", "SP");
		Viagem v11 = new Viagem(11, 1, 2017, p10, "Rogerio", 2.8, 12.50, "Brasilía", "DF");
		Viagem v12 = new Viagem(12, 4, 2017, p5, "Mario", 9.3, 5.00, "Brasilía", "DF");
		Viagem v13 = new Viagem(13, 8, 2017, p1, "Lucas", 164.9, 10.00, "Brasilía", "DF");
		Viagem v14 = new Viagem(14, 1, 2017, p4, "Bruno", 3.3, 19.75, "Brasilía", "DF");
		Viagem v15 = new Viagem(15, 8, 2017, p9, "Mairon", 4.9, 20.00, "Brasilía", "DF");
		Viagem v16 = new Viagem(16, 4, 2017, p2, "Luigi", 6.2, 25.16, "Brasilía", "DF");
		Viagem v17 = new Viagem(17, 9, 2017, p6, "Sonic", 456.5, 4.61, "Brasilía", "DF");
		Viagem v18 = new Viagem(18, 1, 2017, p8, "Links", 16.8, 9.00, "Brasilía", "DF");
		Viagem v19 = new Viagem(19, 10, 2017, p6, "Matheus", 13.1, 12.00, "Brasilía", "DF");
		Viagem v20 = new Viagem(20, 12, 2017, p1, "Daniel", 10.1, 5.00, "Brasilía", "DF");
		
		this.viagems.add(v1);
		this.viagems.add(v2);
		this.viagems.add(v3);
		this.viagems.add(v4);
		this.viagems.add(v5);
		this.viagems.add(v6);
		this.viagems.add(v7);
		this.viagems.add(v8);
		this.viagems.add(v9);
		this.viagems.add(v10);
		this.viagems.add(v11);
		this.viagems.add(v12);
		this.viagems.add(v13);
		this.viagems.add(v14);
		this.viagems.add(v15);
		this.viagems.add(v16);
		this.viagems.add(v17);
		this.viagems.add(v18);
		this.viagems.add(v19);
		this.viagems.add(v20);
		
	}

	
	//Get e Set
	public ArrayList<Passageiro> getPassageiros() {
		return passageiros;
	}
	public ArrayList<Viagem> getViagems() {
		return viagems;
	}
	
	//Metodo que retorna info da ONG de acordo com o nome
	public String getInfoPassageiro(String nome){
		String resultado = "";
		
		//percorrer a lista de Passageiro buscando pelo nome
		for (int i = 0; i < this.passageiros.size(); i++) {
			if (this.passageiros.get(i).getNome().equals(nome)) {
				resultado = "Nome: " + this.passageiros.get(i).getNome() + "\n" +
							"Idade: " + this.passageiros.get(i).getIdade() + "\n" +
							"Cidade: " + this.passageiros.get(i).getCidade() + "\n" +
							"UF: " + this.passageiros.get(i).getUF();
			}
		}
		return resultado;
	}
	
	
	//Metodo que retorna info da Viagen de acordo com o Viagen
	public int getQtdeViagens(String passageiro){
		int resultado = 0;
		
		//percorrer a lista de Passageiro buscando pela Viagen
		for (int i = 0; i < this.viagems.size(); i++) {
			if (this.viagems.get(i).getPassageiro().getNome().equals(passageiro)) {
				resultado ++;
			}
		}
		return resultado;
	}
	
	//Metodo que retorna info da Viagen de acordo com o Maior Viagen
	public int getMaiorViagem(){
		double distancia = 0;
		int resultado = 0;
		
		//percorrer a lista de Passageiro buscando pela Maior Viagen
		for (int i = 0; i < this.viagems.size(); i++) {
			if (this.viagems.get(i).getDistancia() > distancia) {
				distancia = this.viagems.get(i).getDistancia();
				resultado = this.viagems.get(i).getCodigo();
				
			}
		}
		return resultado;
	}
	
	//Metodo que retorna info da Viagen de acordo com o Maior Viagen
	public ArrayList<String> listaUFsViagem(String passageiro){
		ArrayList<String> resultado = new ArrayList<String>();
		
		//percorrer a lista
		for (int i = 0; i < this.viagems.size(); i++) {
			if (this.viagems.get(i).getPassageiro().getNome().equals(passageiro)) {
				resultado.add(this.viagems.get(i).getUF());
			}
		}
		return resultado;		
	}
	
	
	
	
	
	

}
