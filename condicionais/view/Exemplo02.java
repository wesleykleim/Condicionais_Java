package br.com.fiap.condicionais.view;

import javax.swing.JOptionPane;

public class Exemplo02 {

	//Criar uma calculadora
	public static void main(String[] args) {
		//Ler dois n�meros
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		
		//Pedir a opera��o para o usu�rio (+, -, *, /)
		String operador = JOptionPane.showInputDialog("Digite a opera��o");
		
		//CTRL + / -> comenta as linhas selecionadas
		//Realizar a opera��o e exibir a resposta
		switch(operador) {
		case "+":
			JOptionPane.showMessageDialog(null, "A soma �: " + (n1 + n2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "A subtra��o �: " + (n1 - n2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "A multiplica��o �: " + (n1 * n2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "A divis�o �: " + (n1 /n2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Opera��o inv�lida");
		}
		
	}//main
}//class