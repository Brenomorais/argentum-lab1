package br.com.brenomorais.argentum.model;

import java.time.LocalDateTime;
import java.util.List;

public class CandlestickFactory {
	
	public Candlestick geraCandleParaData(List<Negociacao> negociacoes, LocalDateTime data) {
		
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size() -1).getPreco();
		
		double minimo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double maximo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		
		double volume = 0;
		
		for (Negociacao negociacao : negociacoes) {
			
			volume += negociacao.getVolume();
			
			if(negociacao.getPreco() > maximo) {
				maximo = negociacao.getPreco();
			}else if(negociacao.getPreco() < minimo) {
				minimo = negociacao.getPreco();
			}
		}	
		
		return new Candlestick(abertura, fechamento, maximo, minimo, volume, data);		
	}

}
