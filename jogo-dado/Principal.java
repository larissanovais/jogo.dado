package encontroJava1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		JogoDeDado jd = new JogoDeDado();
		JogoDeDadoFaces jdf = new JogoDeDadoFaces();
		
		Scanner entrada = new Scanner(System.in);
		
		String opcao;
		
		while(true) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Jogo dos 7");
			System.out.println("2- Dado de várias faces");
			opcao = entrada.next();
			
			
			switch(opcao) {
				case "1":
					jd.jogar();
					break;
					
				case "2":
					jdf.jogar();
					break;
					
				default:
					System.out.println("Opção incorreta");
					break;
			}
		}
			

	}

}