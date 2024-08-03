package hn.unah.examen.examen.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio JpaRepository
<Clientes, String> {

}

boolean existsById(String dniCliente);

Object findById(String dniCliente);
