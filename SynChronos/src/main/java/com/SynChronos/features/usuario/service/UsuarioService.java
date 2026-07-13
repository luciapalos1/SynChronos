package com.SynChronos.features.usuario.service;

import com.SynChronos.features.usuario.Role;
import com.SynChronos.features.usuario.dtos.CredencialDto;
import com.SynChronos.features.usuario.dtos.UsuarioNewDto;
import com.SynChronos.features.usuario.dtos.UsuarioResponseDto;
import com.SynChronos.features.usuario.mapper.CredencialMapper;
import com.SynChronos.features.usuario.mapper.UsuarioMapper;
import com.SynChronos.features.usuario.model.CredencialEntity;
import com.SynChronos.features.usuario.model.UsuarioEntity;
import com.SynChronos.features.usuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;
    private CredencialMapper credencialMapper;

    public UsuarioResponseDto registrarUsuario(UsuarioNewDto usuarioNuevo, CredencialDto credencialNueva){
        UsuarioEntity usuario = usuarioMapper.toEntity(usuarioNuevo);
        usuario.setActivo(true);

        CredencialEntity credencial = credencialMapper.toEntity(credencialNueva);
        credencial.setRole(Role.ROLE_USUARIO);
        usuario.setCredencial(credencial);

        usuario.setCredencial(credencial);

        return usuarioMapper.toResponseDto(usuarioRepository.save(usuario));
    }


}
