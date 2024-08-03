package hn.unah.examen.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data

public class Clientes {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="dni")
        private long dni;

        private String nombre;

        private String apellido;
    
    
}
