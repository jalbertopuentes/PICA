package co.com.kallsonys.oms.dto;

import java.util.Date;

public class FiltroFechasDto {
	
	private Date fechaInicial;
	private Date fechaFinal;
	public Date getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
