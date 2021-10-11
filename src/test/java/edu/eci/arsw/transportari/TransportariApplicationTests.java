package edu.eci.arsw.transportari;

import edu.eci.arsw.transportari.model.Usuario;
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
		us.setIdUsuario(1);
		us.setNombre("prueba1");
		us.setApellido("test1");
		us.setCorreo("prueba1@gmail.com");
		us.setUsuario("prueba01");
		us.setClave(encoder.encode("prueba1"));

		Usuario retorno = repo.save(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
