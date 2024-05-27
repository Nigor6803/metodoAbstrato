package aplicacao;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Forma;
import entidade.Retangulo;
import entidade.Circulo;
import entidade.enums.Cor;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		List <Forma> lista = new ArrayList<>();
		
		System.out.print("FORMAS:");
		int n = edd.nextInt();
		
		for (int i = 1;i <=n ;i++) {
			System.out.println(i+"º FORMA");
			System.out.print("RETANGULO OU CIRCULO:(R/C)");
			char cf = edd.next().charAt(0);
			System.out.print("PRETO/AZUL/VERMELHO:(P/A/V)");
			Cor cor = Cor.valueOf(edd.next());
			
			if (cf == 'R') {
				
				System.out.print("ALTURA:");
				double altura = edd.nextDouble();
				System.out.print("LARGURA:");
				double largura = edd.nextDouble();
				
				lista.add(new Retangulo(cor, altura, largura));
			}
			else {
				System.out.print("RAIO:");
				double raio = edd.nextDouble();
				
				lista.add(new Circulo(cor,raio));
			}
			System.out.println();
			System.out.println("AREAS DAS FORMAS:");
			for (Forma forma : lista) {
				System.out.println();
				System.out.println("AREA: "+String.format("%.2f",forma.area()));
				System.out.println("COR DA AREA:" + forma.getCor());
				System.out.println();
			}
		}
		
		
		edd.close();
	}

}
