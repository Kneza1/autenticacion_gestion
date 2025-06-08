package com.api.autenticacion_gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.autenticacion_gestion.models.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}
