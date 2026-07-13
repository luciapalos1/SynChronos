package com.SynChronos.features.usuario.mapper;

import com.SynChronos.features.usuario.dtos.CredencialDto;
import com.SynChronos.features.usuario.model.CredencialEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface CredencialMapper {
    CredencialEntity toEntity (CredencialDto credencialDto);
    CredencialDto toDto (CredencialEntity credencial);

}
