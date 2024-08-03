package hn.unah.examen.examen.repositorios;



import hn.unah.examen.examen.modelos.Cuotas;

public interface CuotaRepositorio extends JpaRepository<Cuotas, Long>{

    Cuotas save(Cuotas cuotas);


}

