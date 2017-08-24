package opet.aulatds.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Vector;

import opet.aulatds.pessoa.Pessoa;
import opet.aulatds.util.Leitor;

public class Main {

	/**
	 * CONSTANTE NUM_PESSOA que definirá a quantidade atribuída à listaPessoas, que é uma lista que recebe o Objeto pessoa
	 */
	private static final int NUM_PESSOAS = 10000000;
	
	public static void main(String[] args) {
		
		//Pessoa[] listaPessoas = new Pessoa[NUM_PESSOAS];
		
		/*INICIO ARRAYLIST*/
		
		System.out.println("Teste de performance de listas com "+ NUM_PESSOAS + " registros");
		System.out.println("=====================================");
		
		ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		long tInicio = System.currentTimeMillis();
		
		for(int i = 0; i < NUM_PESSOAS; i++){
			//listaPessoas.add(montarPessoa());
			listaPessoas.add(new Pessoa("Israel", "m", new Date()));
		}
		long tFim = System.currentTimeMillis();
		
		System.out.println("ArrayList.add() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		for (Pessoa pessoa : listaPessoas) {
			/*System.out.println(pessoa.getNome());
			System.out.println(pessoa.getSexo());
			System.out.println(pessoa.getDataNascimento());
			System.out.println("==================================");*/
		}
		
		tFim = System.currentTimeMillis();
		
		System.out.println("ArrayList.get() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		
		for(int i = NUM_PESSOAS-1; i >= 0; i--){
			listaPessoas.remove(i);
		}
		tFim = System.currentTimeMillis();
		
		System.out.println("ArrayList.remove() :" + (tFim - tInicio));
		
		/*FIM ARRAYLIST*/
		
		System.out.println("=====================================");
		
		/*INICIO VECTOR*/
		
		Vector<Pessoa> listaPessoas1 = new Vector<Pessoa>();
		
		tInicio = System.currentTimeMillis();
		
		for(int i = 0; i < NUM_PESSOAS; i++){
			//listaPessoas.add(montarPessoa());
			listaPessoas1.add(new Pessoa("Israel", "m", new Date()));
		}
		tFim = System.currentTimeMillis();
		
		System.out.println("Vector.add() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		for (Pessoa pessoa1 : listaPessoas1) {
			/*System.out.println(pessoa.getNome());
			System.out.println(pessoa.getSexo());
			System.out.println(pessoa.getDataNascimento());
			System.out.println("==================================");*/
		}
		
		tFim = System.currentTimeMillis();
		
		System.out.println("Vector.get() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		
		for(int i = NUM_PESSOAS-1; i >= 0; i--){
			listaPessoas1.remove(i);
		}
		tFim = System.currentTimeMillis();
		
		System.out.println("Vector.remove() :" + (tFim - tInicio));
		
		/*FIM VECTOR*/
		System.out.println("=====================================");
		/*INICIO LINKEDLIST*/
		
		LinkedList<Pessoa> listaPessoas2 = new LinkedList<Pessoa>();
		
		tInicio = System.currentTimeMillis();
		
		for(int i = 0; i < NUM_PESSOAS; i++){
			//listaPessoas.add(montarPessoa());
			listaPessoas2.add(new Pessoa("Israel", "m", new Date()));
		}
		tFim = System.currentTimeMillis();
		
		System.out.println("LinkedList.add() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		for (Pessoa pessoa2 : listaPessoas2) {
			/*System.out.println(pessoa.getNome());
			System.out.println(pessoa.getSexo());
			System.out.println(pessoa.getDataNascimento());
			System.out.println("==================================");*/
		}
		
		tFim = System.currentTimeMillis();
		
		System.out.println("LinkedList.get() :" + (tFim - tInicio));
		
		tInicio = System.currentTimeMillis();
		
		for(int i = NUM_PESSOAS-1; i >= 0; i--){
			listaPessoas2.remove(i);
		}
		tFim = System.currentTimeMillis();
		
		System.out.println("LinkedList.remove() :" + (tFim - tInicio));
		
		/*FIM LINKED LIST*/
		System.out.println("=====================================");
	}
	
	public static Pessoa montarPessoa(){
		String nome = Leitor.readString("Entre com o nome: ");
		String sexo = Leitor.readString("Entre com o sexo: ");
		String dataNascimento = Leitor.readString("Entre com a data de nascimento dd/mm/aaaa: ");
		
		return new Pessoa(nome, sexo, 
						new Date(dataNascimento));
	}
	

}
