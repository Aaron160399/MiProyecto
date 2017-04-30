/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.sql.Time;
import java.util.Date;
import javax.xml.soap.Text;

/**
 *
 * @author salva
 */
public class Consulta {
    private int IdCita;
private int Cliente_idCliente;
private int Usuari_idUsuario;
    private Date fecha;
    private Time horaInicio;
    private Text asunto;

    public int getIdCita() {
        return IdCita;
    }

    public void setIdCita(int IdCita) {
        this.IdCita = IdCita;
    }

    public int getCliente_idCliente() {
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente) {
        this.Cliente_idCliente = Cliente_idCliente;
    }

    public int getUsuari_idUsuario() {
        return Usuari_idUsuario;
    }

    public void setUsuari_idUsuario(int Usuari_idUsuario) {
        this.Usuari_idUsuario = Usuari_idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Text getAsunto() {
        return asunto;
    }

    public void setAsunto(Text asunto) {
        this.asunto = asunto;
    }

}
