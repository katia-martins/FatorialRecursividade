
/*
 * Autor: Katia Martins Goncalves
 */

package controller;

public class FatorialController {

	public FatorialController() {
		super();
	}
	//funcao que calcula o fatorial de um numero inteiro
	public int fat(int numero) {
		
		//condicao de parada
		if (numero <= 1) {
			
			return 1;
			
		} else {
			
			//se o valor for igual a 1 (um), para a recursão e retorna calculando os valores
			return numero * fat(numero - 1);
		}
	}
}