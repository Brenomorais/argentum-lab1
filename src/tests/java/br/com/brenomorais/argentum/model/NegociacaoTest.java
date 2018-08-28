package br.com.brenomorais.argentum.model;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NegociacaoTest {

	@Test()
	public void naoDeveCriarNegociacaoComPrecoNegatico() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Negociacao(-20.0, 2, LocalDateTime.now());
		});
	}

	@Test()
	public void naoDeveCriarNegociacaoComDataNula() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Negociacao(-20.0, 2, null);
		});
	}

	@Test()
	public void naoDeveCriarNegociacaoComQuantidadeNegativa() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Negociacao(20.0, -1, LocalDateTime.now());
		});
	}

}
