package guru.springframework.dto;

import java.io.Serializable;

public class ConfNotificacionObliDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long identificacionObligado;
	private String sender;
	private String destino;
	private short estado;

	public ConfNotificacionObliDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getIdentificacionObligado() {
		return identificacionObligado;
	}

	public void setIdentificacionObligado(Long identificacionObligado) {
		this.identificacionObligado = identificacionObligado;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public short getEstado() {
		return estado;
	}

	public void setEstado(short estado) {
		this.estado = estado;
	}

}
