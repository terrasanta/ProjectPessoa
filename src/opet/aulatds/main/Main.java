package opet.aulatds.main;

import java.util.Date;
import opet.aulatds.pessoa.Pessoa;
import opet.aulatds.util.Leitor;

public class Main {

	public static void main(String[] args) {
		
		Pessoa[] listaPessoas = new Pessoa[2];
		
		for(int i = 0; i < listaPessoas.length; i++){
			listaPessoas[i] = montarPessoa();
		}
		
		for(int i = 0; i < listaPessoas.length; i++){
			System.out.println(listaPessoas[i].getNome());
			System.out.println(listaPessoas[i].getSexo());
			System.out.println(listaPessoas[i].getDataNascimento());
		}
		
	}
	public static Pessoa montarPessoa(){
		String nome = Leitor.readString("Entre com o nome: ");
		String sexo = Leitor.readString("Entre com o sexo: ");
		String dataNascimento = Leitor.readString("Entre com a data de nascimento dd/mm/aaaa: ");
		
		return new Pessoa(nome, sexo, 
						new Date(dataNascimento));
	}
	

}
