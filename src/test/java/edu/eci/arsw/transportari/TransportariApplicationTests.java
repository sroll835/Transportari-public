package edu.eci.arsw.transportari;

import edu.eci.arsw.transportari.model.entity.Usuario;
import edu.eci.arsw.transportari.repository.IUsuarioRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TransportariApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	public void crearUsuarioTest(){
		Usuario us = new Usuario();
		us.setNombre("prueba2");
		us.setApellido("test2");
		us.setCorreo("prueba2@gmail.com");
		us.setUsername("prueba02");
		us.setClave(encoder.encode("prueba2"));

		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
