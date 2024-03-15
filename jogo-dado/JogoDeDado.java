package encontroJava1;

public class JogoDeDado {

	private Dado dado1 = new Dado();
	private Dado dado2 = new Dado();
	
	public void jogar() {
		int vf1, vf2;
		
		dado1.lancar();
		vf1 = dado1.obterValordaFace();
		
		dado2.lancar();
		vf2 = dado2.obterValordaFace();
		
		if (vf1 + vf2 == 7) {
			System.out.println("Você ganhou!\n");
		}else {
			System.out.println("Você perdeu!\n");
		}
		
		System.out.printf("Você ganhou! Valor dos dados são: %d e %d", vf1,vf2);
	}
}