package carlodelgado.test.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "monedaorigen")
@Data
public class MonedaOrigen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String pais ;
	
	Date fecha_creacion;

}
