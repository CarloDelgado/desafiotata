package carlodelgado.test.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



import carlodelgado.test.model.Usuario;
import carlodelgado.test.service.UsuarioService;


@Controller
@RequestMapping("/tipodecambio")
public class TipodeCambioController {

	@Autowired
	UsuarioService usuarioservice;

	@GetMapping("/mostrarelcambio/{idUsuario}")
	public ResponseEntity<?> mostrarUsuarios(@PathVariable int idUsuario) {
		Usuario usuario = usuarioservice.get(idUsuario);

		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuario.getName() + " su tipo de cambio es : a soles " + usuario.getMonto() * 3.24);
	}

	@GetMapping("/all")
	public ResponseEntity<?> todoslosusuarios() {
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.buscarTodas());
	}

	@PostMapping(value = "/save")
	public ResponseEntity<?> guardarususarios(@RequestBody Usuario usuario) {
		/*
		 * Usuario usuario = new Usuario(); usuario.setName("test");
		 * usuario.setMonto(56.9);
		 */
		System.out.println("Existen errores");
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.guardarusuario(usuario));
	}

	@DeleteMapping("/borrar-usuario/{idUsuario}")
	public ResponseEntity<?> borrarUsuario(@PathVariable int idUsuario){
	
		usuarioservice.elimina(usuarioservice.get(idUsuario));
		
		
		return ResponseEntity.accepted().build();
		
	}
	
	
	
	
	@PutMapping( "/update/{idusuario}")
	
	public ResponseEntity<Usuario> updateusuarios(@PathVariable int idusuario , @RequestBody Usuario usuario) {
		
		usuario.setId(idusuario);
		Usuario usuarios = new Usuario();
		usuarios = usuarioservice.get(idusuario);
		usuarios.setName(usuario.getName());
		
	return ResponseEntity.status(HttpStatus.CREATED).body(usuarioservice.actualizarusuario(usuario));
			
	}
	
/*	
	Put(url{})
	Response (path varialbe int, RequestBody) {
	
		

		
		
priemera opcion		void




	segunda opcion	.body(service.save(usuario))
		return Responseentity
	}
	*/
	
	
}