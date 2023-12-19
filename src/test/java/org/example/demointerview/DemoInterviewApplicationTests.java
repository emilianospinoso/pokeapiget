package org.example.demointerview;

import org.example.demointerview.service.PokemonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class DemoInterviewApplicationTests {

    @Autowired
    private PokemonService pokemonService;

    @Test
    void contextLoads() {
        // Verifica que el contexto de la aplicación se cargue correctamente
    }

    @Test
    void testPokemonService() {
        // Verifica que el servicio de Pokemon no sea nulo
        assertNotNull(pokemonService);

        // Puedes agregar más pruebas según sea necesario para verificar el comportamiento del servicio
    }
    
}
