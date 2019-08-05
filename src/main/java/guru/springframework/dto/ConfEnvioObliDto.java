package guru.springframework.dto;

import java.io.Serializable;

public class ConfEnvioObliDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID=1L;
    private Long identificacionObligado;
    private Long numResoluDian;
    private String sender;
    private short estado;
    private String senderRechazo;
    private String destinoRechazo;
    
    public ConfEnvioObliDto(){
        // TODO Auto-generated constructor stub
    }

    public Long getIdentificacionObligado(){
        return identificacionObligado;
    }

    public void setIdentificacionObligado(Long identificacionObligado){
        this.identificacionObligado=identificacionObligado;
    }

    public Long getNumResoluDian(){
        return numResoluDian;
    }

    public void setNumResoluDian(Long numResoluDian){
        this.numResoluDian=numResoluDian;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender=sender;
    }

    public short getEstado(){
        return estado;
    }

    public void setEstado(short estado){
        this.estado=estado;
    }

	public String getSenderRechazo() {
		return senderRechazo;
	}

	public void setSenderRechazo(String senderRechazo) {
		this.senderRechazo = senderRechazo;
	}

	public String getDestinoRechazo() {
		return destinoRechazo;
	}

	public void setDestinoRechazo(String destinoRechazo) {
		this.destinoRechazo = destinoRechazo;
	}
    
    

}
