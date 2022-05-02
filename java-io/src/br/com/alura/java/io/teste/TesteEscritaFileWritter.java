package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWritter {
											//vou deixar a bomba cair na pilha
	public static void main(String[] args) throws IOException {
		
		//PARTE 4 - escrita d codigo subindo ao alto nivel
		
		
//		OutputStream fos = new FileOutputStream("lorem-testeEscrita.txt");//excecao checked
//		Writer osw = new OutputStreamWriter(fos);
//		
		
		FileWriter fw = new FileWriter("lorem-Simplificado.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.write(System.lineSeparator()); // quebra a linha independente do sistema
		bw.newLine();
		bw.write("teste pula 2 linhas");
		
		bw.close();
		
	}
	
	
}
