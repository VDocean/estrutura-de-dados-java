package com.vitoria.estruturadados.Vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;
    
	public Vetor(int capacidade){
		this.elementos=new String[capacidade];
		
	}
	
	//adiciona valor no final do vetor
	public boolean adiciona(String elemento) {
		
		if(tamanho<elementos.length) {
			elementos[tamanho]= elemento;
			tamanho++;
			System.out.println(elemento);
			return true;
		}
		return false;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	//exibe os elementos do vetor
	
	@Override
	public String toString() {
		
		StringBuilder s=new StringBuilder();
		s.append("[");
		
		for(int i=0;i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
	
	
	
	

}
