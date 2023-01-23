package conversorMoedas;

import javax.swing.JOptionPane;

public class Funcao {	
	
	ConverteMoedas converter = new ConverteMoedas();
	
	public void ConverterMoedas(double valorRecebido) {
		
		String opcao = (JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();	
		switch (opcao) {
		case "De Reais a Dólares":
			converter.ConverterReaisADolar(valorRecebido);
			break;
		case "De Reais a Euros":
			converter.ConverterReaisAEuro(valorRecebido);
			break;
		}
	}
}
