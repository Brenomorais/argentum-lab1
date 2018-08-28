package br.com.brenomorais.argentum.teste;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import br.com.brenomorais.argentum.model.Candlestick;
import br.com.brenomorais.argentum.model.CandlestickFactory;
import br.com.brenomorais.argentum.model.Negociacao;

public class TestCandlestickFactory {
	
	public static void main(String[] args) {
		
		LocalDateTime hoje = LocalDateTime.now();		
		
		Negociacao negociacao1 = new Negociacao(40.0, 100, hoje);
		Negociacao negociacao2 = new Negociacao(35.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao4 = new Negociacao(20.0, 100, hoje);
		
		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		
		Candlestick candle = fabrica.geraCandleParaData(negociacoes, hoje);
		
		System.out.println("abertura: " +candle.getAbertura());
		System.out.println("fechamento: " +candle.getFechamento());
		System.out.println("maximo: " +candle.getMaximo());
		System.out.println("minimo: " +candle.getMinimo());
		System.out.println("volume: " +candle.getVolume());
		
	}
}
