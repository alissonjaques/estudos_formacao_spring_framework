package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import model.*;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	public static Integer chaveSequencial = 1;

	static {
		int id = chaveSequencial;
		Empresa alura = new Empresa(id, "Alura Cursos Online", "11.111.111/1111-11",
				new Date(System.currentTimeMillis()));
		id++;
		Empresa caelum = new Empresa(id, "Caleum", "22.111.111/1111-11", new Date(System.currentTimeMillis()));
		id++;
		Empresa google = new Empresa(id, "Google", "33.111.111/1111-11", new Date(System.currentTimeMillis()));
		id++;
		Empresa amazon = new Empresa(id, "Amazon", "44.111.111/1111-11", new Date(System.currentTimeMillis()));
		chaveSequencial = id;
		lista.add(alura);
		lista.add(caelum);
		lista.add(google);
		lista.add(amazon);
		
		Usuario u1 = new Usuario("bruna","123456");		
		Usuario u2 = new Usuario("alisson","123456");		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}

	public void remove(Empresa empresa) {
		Banco.lista.remove(empresa);
	}

	public void remove(Integer id) {
		Iterator<Empresa> iterator = lista.iterator();

		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();
			if (empresa.getId() == id) {
				iterator.remove();
			}
		}
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario: listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;				
			}			
		}
		return null;
	}
}
