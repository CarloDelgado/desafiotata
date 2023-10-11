package carlodelgado.test.service;

import java.util.List;

import carlodelgado.test.model.Usuario;

public interface UsuarioService {
	void inserta(Usuario usuario);

	List<Usuario> buscarTodas();

	void guardar(Usuario usuario);

	Usuario guardarusuario(Usuario usuario);
	
	void actualiza(Usuario usuario);

	void elimina(Usuario Usuario);

	void eliminar(int idUsuario);
	
	Usuario get(int usuarioId);
	
	Usuario actualizarusuario(Usuario usuario);
	

}
