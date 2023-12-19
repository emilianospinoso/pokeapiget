package org.example.demointerview.service;

import org.example.demointerview.model.Pokemon;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    @Override
    public List<Pokemon> getAllPokemon() {
        RestTemplate restTemplate = new RestTemplate();
        PokemonResponse response = restTemplate.getForObject(API_URL, PokemonResponse.class);
        System.out.println("implementacion 1");
        return response.getResults();
    }
}