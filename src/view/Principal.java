
/*
 * Autor: Katia Martins Goncalves
 */

package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

public class Principal {

	public static void main(String[] args) {
		
		//declaracao de variaveis
		int entrada;
		int fatorial;
		FatorialController fc = new FatorialController();
			
			//box solicitando input do usuário
			do{
				entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro entre 1 e 12:"));
			}while (entrada < 1 || entrada > 12);

		//variavel recebe o retorno da funcao 
		fatorial = fc.fat(entrada);
		//saida na tela
		System.out.println(fatorial);
	}

}
