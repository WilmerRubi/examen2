package hn.unah.examen.examen.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "prestamos")
@Data

public class Prestamos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoPrestamo")
    private long codigoPrestamo;

    private double fechaApertura;

    private double monto;

    private double cuota;

    private int plazo;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "dni", referencedColumnName = "dni")
    private Clientes dni;

}
