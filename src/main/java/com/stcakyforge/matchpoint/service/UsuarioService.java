package com.stcakyforge.matchpoint.service;

import com.stcakyforge.matchpoint.dtos.request.UsuarioRequestDto;
import com.stcakyforge.matchpoint.dtos.response.UsuarioResponseDto;
import com.stcakyforge.matchpoint.mapper.UsuarioMapper;
import com.stcakyforge.matchpoint.model.Usuario;
import com.stcakyforge.matchpoint.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper mapper) {
        this.usuarioRepository = usuarioRepository;
        this.mapper = mapper;
    }

    public UsuarioResponseDto salvarUsuario(UsuarioRequestDto requestDto){
        return mapper.toDto(usuarioRepository.save(mapper.toEntity(requestDto)));
    }

    public List<UsuarioResponseDto> listaUsuarios(){
        return mapper.toDto(usuarioRepository.findAll());
    }

    public UsuarioResponseDto pegarUsuarioPorId(Long id){
        return mapper.toDto(usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado no banco de dados")));
    }

    public void deleteUsuario(Long id){
        usuarioRepository.findById(id);
    }

    public UsuarioResponseDto atualizarUsuario(Long id, UsuarioRequestDto usuario){

        Usuario newUsuario = mapper.toEntity(pegarUsuarioPorId(id));

        newUsuario.setId(id);
        newUsuario.setUsername(usuario.username() != newUsuario.getUsername() ? newUsuario.getUsername() : usuario.username());
        newUsuario.setEmail(usuario.email() != newUsuario.getEmail() ? newUsuario.getEmail() : usuario.email());

        return mapper.toDto(mapper.toEntity(Optional.of(usuarioRepository.save(newUsuario))));
    }

    public UsuarioResponseDto atualizarSenha(Long id, String novaSenha){

        Usuario usuario = mapper.toEntity(usuarioRepository.findById(id));

        usuario.setId(id);
        usuario.setUsername(usuario.getUsername());
        usuario.setEmail(usuario.getEmail());
        usuario.setSenha(novaSenha);

        return mapper.toDto(mapper.toEntity(Optional.of(usuarioRepository.save(usuario))));
    }
}
