package com.marcelino.aprendendo_spring.business;

import com.marcelino.aprendendo_spring.infrastructure.entity.Usuario;
import com.marcelino.aprendendo_spring.infrastructure.exceptions.ConflictException;
import com.marcelino.aprendendo_spring.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.ConfigurationException;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        try {
            emailExiste(usuario.getEmail());
            return usuarioRepository.save(usuario);

        } catch (ConflictException e) {
            throw new ConflictException("Email já cadastrado:" + e.getCause());
        }
    }

    public void emailExiste ( String email){
        try{
            boolean existe = verificaEmailExistente(email);
            if(existe){
                throw new ConflictException("Email já cadastrado: " + email)
            }
        }catch(ConflictException e ){
            throw new ConflictException("Email já cadastrado" + e.getCause());
        }
    }

    public boolean verificaEmailExistente(String email){
        return  usuarioRepository.existsByEmail(email);
    }


}
