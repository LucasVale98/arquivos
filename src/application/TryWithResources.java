package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) {

		String path = "C:\\Auto Estudos\\18 - Java COMPLETO 2020 Programação Orientada a Objetos +Projetos\\Seção 17 Trabalhando com arquivos\\info.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
