package hn.unah.examen.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cuotas")
@Data

public class Cuotas {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "codigoCuota")
    private long codigoCuenta;

    private int mes;

    private double interes;

    private double capital;

    private double saldo;

    



    
}
