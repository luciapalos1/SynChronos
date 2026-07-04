package com.SynChronos.features.usuario.repository;

import com.SynChronos.features.usuario.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity,Long> {

}
