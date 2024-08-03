package hn.unah.examen.examen.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.examen.modelos.Clientes;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cuotas")
public class Cuotacliente {


    @Autowired
    private CuentaCliente cuotacliente;

    @PostMapping("asociar/{dni}")
    public Clientes asociarClientes(@PathVariable(name="dni") String dni,
                                    @RequestBody Clientes clientes ) {
  
        //TODO: process POST request
        
        return this.cuotacliente.asociarClientes(dni, clientes);
    }
    
    
    
}
