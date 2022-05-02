package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {
											//vou deixar a bomba cair na pilha
	public static void main(String[] args) throws IOException {
		
		//PARTE 3 - combina parte 1 e 2 
		//Stream sao dados binarios(pdf e imagem,reader e writer é pra caracteres
		
		//InputStream fis = new FileInputStream("lorem.txt");//excecao checked
		InputStream fis = System.in;//recebe dados do console
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		//OutputStream fos = new FileOutputStream("lorem-CopiaECola.txt");//excecao checked
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);

			bw.flush();// mostra a palavra na hora q dou enter
			
			linha = br.readLine();
			
			//pra ficar mais obvio com 2 linhas
			bw.newLine();
			bw.newLine();
		}
		
		br.close();
		bw.close();
		
	}
	
	
}
