package carlodelgado.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import carlodelgado.test.model.Usuario;
import carlodelgado.test.repository.UsuarioRepository;
import carlodelgado.test.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public void inserta(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Usuario> buscarTodas() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public void guardar(Usuario usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.save(usuario);
	}

	@Override
	public void actualiza(Usuario usuario) {
		// TODO Auto-generated method stub

	}

	@Override
	public void elimina(Usuario Usuario) {
		// TODO Auto-generated method stub
		usuarioRepository.delete(Usuario);
	}

	@Override
	public void eliminar(int idUsuario) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("deprecation")
	@Override
	public Usuario get(int usuarioId) {
		// TODO Auto-generated method stub
		return usuarioRepository.getById(usuarioId);
	}

	@Override
	public Usuario guardarusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario actualizarusuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

}
