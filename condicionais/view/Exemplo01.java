package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		//Ler um n�mero  
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero ae"));

		//N�o � necess�rio a chaves quando tiver uma 
		//�nica instru��o dentro do if ou else
		
		//verificar se � par ou �mpar
		if (numero % 2 == 0) 
			JOptionPane.showMessageDialog(null, "O n�mero � par");
		else  
			JOptionPane.showMessageDialog(null, "O n�mero � �mpar");
		
		//Ler a idade
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
				
		//Verificar se deve ou n�o votar
		// entre 16 e 18 ou maior de 65- Opcional
		// Menor de 16 - n�o vota
		// 18 e 65 - obrigat�rio
		if (idade >= 16 && idade < 18 || idade >= 65) {
			JOptionPane.showMessageDialog(null, "O voto � opcional");
		} else if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "O voto � obrigat�rio");
		} else {
			JOptionPane.showMessageDialog(null, "N�o pode votar");
		}
				
	}
}