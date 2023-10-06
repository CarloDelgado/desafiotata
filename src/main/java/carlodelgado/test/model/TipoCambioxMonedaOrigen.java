package carlodelgado.test.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tipocambioxmonedaorigen")
@Data
public class TipoCambioxMonedaOrigen {

	@Id
	Double id;
	
	Double fkvalor;
	
	Double tipodecambio;
	
	Date fecha_creacion;
}
