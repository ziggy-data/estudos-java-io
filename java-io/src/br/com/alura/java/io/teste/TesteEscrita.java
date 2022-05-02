package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
											//vou deixar a bomba cair na pilha
	public static void main(String[] args) throws IOException {
		
		//PARTE 2 - escrita d codigo
		
		
		OutputStream fos = new FileOutputStream("lorem-testeEscrita.txt");//excecao checked
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("teste pula 2 linhas");
		
		bw.close();
		
	}
	
	
}
