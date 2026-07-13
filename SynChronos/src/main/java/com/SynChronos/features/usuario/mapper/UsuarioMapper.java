package com.SynChronos.features.usuario.mapper;

import com.SynChronos.features.usuario.dtos.UsuarioNewDto;
import com.SynChronos.features.usuario.model.UsuarioEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioEntity toEntity(UsuarioNewDto usuarioNewDto);
    UsuarioNewDto toDto(UsuarioEntity usuario);
}
