package hn.unah.examen.examen.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.examen.modelos.Cuotas;
import hn.unah.examen.examen.repositorios.ClienteRepositorio;
import hn.unah.examen.examen.repositorios.CuotaRepositorio;

@Service
public class cuotaservicio {

    @Autowired
    private CuotaRepositorio cuotaRepositorio;

    @Autowired
    private ClienteRepositorio ClienteRepositorio;

    public Cuotas asociarClienteCuota(String DniCliente, Cuotas cuotas) {
        if (this.ClienteRepositorio.existsById(DniCliente)) {
            cuotas.setCliente(this.ClienteRepositorio.findById(DniCliente).get());
            return this.cuotaRepositorio.save(cuotas);
        }
        return null;
    }

}
