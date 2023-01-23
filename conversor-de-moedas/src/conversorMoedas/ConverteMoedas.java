package conversorMoedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {	
	
	public void ConverterReaisADolar(double valor) {
		
		double moedaDolar = valor / 5.20;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " dólares");
	}
	
	public void ConverterReaisAEuro(double valor) {
		
		double moedaEuro = valor / 5.64;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " dólares");
	}

}
	
