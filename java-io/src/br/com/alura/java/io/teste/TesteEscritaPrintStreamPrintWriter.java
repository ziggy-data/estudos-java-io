package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {
											//vou deixar a bomba cair na pilha
	public static void main(String[] args) throws IOException {
		
		//PARTE 5 - escrita d codigo subindo ao alto nivel
		
		//printstream == printwriter, feito pra respeitar as outras familias q tem readers e writers
		//a classe FileWriter foi criada com o propósito de estabelecer uma entrada com um arquivo de texto
		
		//PrintStream ps =  new PrintStream("lorem-PrintStream.txt");
		PrintWriter ps =  new PrintWriter("lorem-PrintStream.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("Metodo mais alto nivel d manipular dados por enquanto");
		
		ps.close();
		
	}
	
	
}
