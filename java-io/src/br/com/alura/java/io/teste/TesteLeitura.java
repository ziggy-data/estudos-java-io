package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
											//vou deixar a bomba cair na pilha
	public static void main(String[] args) throws IOException {
		
		//PARTE 1
		
		//padrao d projeto - DECORATOR : afeta os padroes de projeto ( br ( isr ( fis )))
		
		//Stream: sabe ler bits e bytes - melhor pra pdf, imagem
		//Reader: tbm sabe ler bits e bytes mas FOCA nos caracteres
		
		//classes InputStream e Reader são templates - classes que definem conteudo para o filho
		
		//Fluxo de entrada com um arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");//excecao checked
		
		//pega os byters de .read do FileInputStream para char
		InputStreamReader isr = new InputStreamReader(fis);
		
		//guarda os todos os caracteres de uma linha
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		while(linha != null) {
			//lê todas as linhas - .readLine() retorna null qnd acaba
			System.out.println(linha);
			linha = br.readLine();
		}
		
		//lê apenas uma linha
		//System.out.println(linha);
		
		br.close();
		
	}
	
	
}
