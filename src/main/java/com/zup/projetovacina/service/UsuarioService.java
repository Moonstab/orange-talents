package com.zup.projetovacina.service;

import com.zup.projetovacina.repository.UsuarioRepository;
import com.zup.projetovacina.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsuarioService {

    @Autowired //injeta UsuarioRepository (classe-interface)
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario ( Usuario usuario ) {
        return usuarioRepository.save(usuario);
    }
    public void validarCadastro(Usuario usuario){
        if (encontrarPorEmail(usuario.getEmail()) != null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email não existe");
        }
        if (encontrarPorCpf(usuario.getCpf()))
    }
    public Usuario encontrarPorEmail( String email){
        return usuarioRepository.findByEmail(email);
    }
    public boolean encontrarPorCpf( String cpf){
        return usuarioRepository.findByCpf(cpf);
    }







        //// Regras cadastrar
        //	public Usuarios regras(Usuarios condicao) throws Exception {
        //		if (existeEmail(condicao.getEmail())) {
        //			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "E-mail já existe.");
        //		} else if (existeCPF(condicao.getCpf())) {
        //			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF já existe.");
        //		}
        //		return usuariosRepository.save(condicao);
        //	}
        //// Condições
        //	public boolean existeEmail(String email) {
        //		List<Usuarios> buscaEmail = usuariosRepository.findByEmail(email);
        //		if ((buscaEmail != null) && (!buscaEmail.isEmpty())) {
        //			return true;
        //		}
        //		return false;
        //	}
        //
        //	public boolean existeCPF(String cpf) {
        //		List<Usuarios> buscaCpf = usuariosRepository.findByCpf(cpf);
        //		if ((buscaCpf != null) && (!buscaCpf.isEmpty())) {
        //			return true;
        //		}
        //		return false;
        //	}
        //
        //	// Buscar
        //	public List<Usuarios> buscarCPF(String cpf) {
        //		return usuariosRepository.findByCpf(cpf);
        //	}
        //
        //	public List<Usuarios> buscarNome(String nome) {
        //		return usuariosRepository.findByNome(nome);
        //	}
        //
        //	public List<Usuarios> buscarEmail(String email) {
        //		return usuariosRepository.findByEmail(email);
        //	}
        //	public List<Usuarios> buscarTudo(){
        //		return usuariosRepository.findAll();
        //	}
    }
