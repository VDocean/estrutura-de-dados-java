package com.vitoria.estruturadados.Vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;
    
	public Vetor(int capacidade){
		this.elementos=new String[capacidade];
		
	}
	
	public boolean adiciona(String elemento) {
		
		if(tamanho<elementos.length) {
			elementos[tamanho]= elemento;
			tamanho++;
			System.out.println(elemento);
			return true;
		}
		return false;
	}
	
	
	
	

}
