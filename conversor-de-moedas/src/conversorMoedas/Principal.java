package conversorMoedas;

import javax.swing.JOptionPane;

public class Principal{
	
	Funcao moedas = new Funcao();
	
	public static void main(String[] args) {
		
		String opcoes = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();
		
		switch (opcoes) {
		case "Conversor de Moeda":
			String input = JOptionPane.showInputDialog("Insira um valor");
			double valorRecebido = Double.parseDouble(input);
			moedas.ConverteMoedas(valorRecebido);
			break;
			
			int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if(JOptionPane.OK_OPTION == resposta) {
				System.out.println("Escolha opção Afirmativa");
			} else {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
			}
		}
	}
}
