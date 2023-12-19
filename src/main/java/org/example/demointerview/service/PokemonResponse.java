package org.example.demointerview.service;

import org.example.demointerview.model.Pokemon;

import java.util.List;

public class PokemonResponse {

	private List<Pokemon> results;

	public List<Pokemon> getResults() {
		return results;
	}

	public void setResults(List<Pokemon> results) {
		this.results = results;
	}
}
