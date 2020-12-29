package br.com.spring.curso.dao;

import java.util.List;
import java.util.stream.Collectors;

import br.com.spring.curso.domain.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{
	
	private static List<Usuario> us;
	
	public UsuarioDaoImpl() {
		createUserList();
	}
	
	private List<Usuario> createUserList() {
		if(us == null) {
			us.add(new Usuario(System.currentTimeMillis()+1L, "Ana", "Da Silva"));
			us.add(new Usuario(System.currentTimeMillis()+1L, "Luiz", "Da Piedade"));
			us.add(new Usuario(System.currentTimeMillis()+1L, "Fernanda", "Da maria"));
			us.add(new Usuario(System.currentTimeMillis()+1L, "Sergio", "Da Mota"));
			us.add(new Usuario(System.currentTimeMillis()+1L, "Wilset", "Dos Anjos"));
			
		}
		return us;
		
	}
 	
	@Override
	public void salvar(Usuario usuario) {
		usuario.setId(System.currentTimeMillis());
		us.add(usuario);
	}

	@Override
	public void editar(Usuario usuario) {
		us.stream()
			.filter((u) -> u.getId().equals(usuario.getId()))
			.forEach((u) -> {
				u.setNome(usuario.getNome());
				u.setSobrenome(usuario.getSobrenome());

			});		
	}

	@Override
	public void excluir(Long id) {
		us.removeIf((u) -> u.getId().equals(id));		
	}

	@Override
	public Usuario getId(Long id) {
		return us.stream()
				.filter((u) -> u.getId().equals(id))
				.collect(Collectors.toList()).get(0);
	}

	@Override
	public List<Usuario> getTodos() {
		return us;
	}	

}
