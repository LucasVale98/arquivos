package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileEscrita {
	public static void main(String[] args) {
		String[] lines = new String[] {
				"Goo Morning",
				"Good afternoon",
				"Good Night"
		};
		
		String path = "C:\\Auto Estudos\\18 - Java COMPLETO 2020 Programa��o Orientada a Objetos +Projetos\\Se��o 17 Trabalhando com arquivos\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
