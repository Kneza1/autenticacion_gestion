package com.api.autenticacion_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.autenticacion_gestion.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
